package com.iroshnk.java.RnD;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CsvTest {
    private static int shopId = 30;
    private static int branchId = 40;
    private static int fromCountryId = 21;
    private static int chargeType = 2;
    private static int chargeId = 0;
    private static int domainId = 0;
    private static String fromCity = "Galle";

    private static String dbUrl = "jdbc:mysql://localhost:3306/shipping";
    //private static String dbUrl = "jdbc:mysql://192.168.1.200:3306/gb_2_1_qa";
    private static String filePath = "C:\\Users\\HP\\Downloads\\csv.csv";


    public static void main(String[] args) {
        Connection connection = connect(dbUrl, "root", "password");

        try (CSVReader reader = new CSVReader(new FileReader(filePath), ',')) {
            String[] rowData = null;
            int i = chargeId;
            reader.readNext();
            reader.readNext();
            while ((rowData = reader.readNext()) != null) {
                int index = 0;
                int countryId = 0;
                for (String data : rowData) {
                    if (index == 0) {
                        String cQuery = "SELECT * FROM Country WHERE country_name = '" + data + "'";
                        try (Statement stmt = connection.createStatement();
                             ResultSet rs = stmt.executeQuery(cQuery)) {
                            if (rs.first()) {
                                countryId = rs.getInt("country_id");
                                System.out.println(rs.getString("country_name"));
                            } else {
                                System.out.println("Country can not find " + data);
                                break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("Country can not find " + data);
                            break;
                        }
                    } else {
                        String query = "INSERT INTO shipping_charge " +
                                "(SHIPPING_CHARGE_ID,BRANCH_ID,DOMAIN_ID,FLAT_AMOUNT,FROM_CITY,FROM_COUNTRY," +
                                "FROM_QUANTITY,PERCENTAGE,SHOP_ID,STATUS,TO_CITY,TO_COUNTRY,TO_QUANTITY,TYPE) " +
                                "VALUES(" + i + "," + branchId + "," + domainId + "," + data + ","+fromCity+"," +
                                fromCountryId + "," + (index - 1) * 0.5 + ",0," + shopId + ",2,null," +
                                countryId + "," + index * 0.5 + "," + chargeType + ");";
                        System.out.println(data);

                        try (Statement stmt = connection.createStatement()) {
                            stmt.executeUpdate(query);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    index++;
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection connect(String dbConnectString, String dbUserId, String dbPassword) {
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection(dbConnectString, dbUserId, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
            conn = null;
        }

        return conn;
    }
}
