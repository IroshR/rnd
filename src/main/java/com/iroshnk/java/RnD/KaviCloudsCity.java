package com.iroshnk.java.RnD;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class KaviCloudsCity {
    private static int shopId = 14; //11
    private static int branchId = 23; //13
    private static int chargeId = 7288;
    private static int domainId = 0;
    private static int productId = 2558;
    //private static int []productId2 = {2574,2575,2576,2577,2578,2581,2582,2584,2585,2587,2588,2589,2590,2625,2592,2593,2596};
    private static int []productId2 = {7018};

    //private static String dbUrl = "jdbc:mysql://localhost:3306/shipping";
    //private static String dbUrl = "jdbc:mysql://192.168.1.200:3306/gb_2_1_qa";
    private static String dbUrl = "jdbc:mysql://192.168.1.200:3306/shipping";
    private static String filePath = "D:\\Learning\\GIT_HUB\\rnd\\src\\main\\java\\com\\iroshnk\\java\\RnD\\csv\\csv_kc.csv";


    public static void main(String[] args) {
        //Connection connection = connect(dbUrl, "root", "password");
        Connection connection = connect(dbUrl, "mutants", "mutaadmin");
        int i = chargeId;
        for(int a : productId2){
            try (CSVReader reader = new CSVReader(new FileReader(filePath), ',')) {
                String[] rowData = null;

                //reader.readNext();
                //reader.readNext();
                while ((rowData = reader.readNext()) != null) {
                    String query = "INSERT INTO DELIVERY_CHARGE " +
                            "(DELIVERY_CHARGE_ID,BRANCH_ID,DESCRIPTION,DOMAIN_ID,FLAT_AMOUNT,FROM_DISTANCE," +
                            "LOCATION,PERCENTAGE,RATE,SHOP_ID,STATUS,THRESHOLD,TO_DISTANCE,TYPE,PRODUCT_ID) " +
                            "VALUES(" + i + "," + branchId + ",NULL," + domainId + "," + rowData[1] + ",0,'"+rowData[0]+"',0,0," +
                            shopId + ",2,0,0,1,"+a+");";

                    System.out.println(query);
                    i++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

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
