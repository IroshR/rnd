package com.iroshnk.java.json.currency;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.Document;

import java.io.File;
import java.util.List;

public class CommonCurrency {
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Document> items = objectMapper.readValue(
                new File("D:\\Learning\\GIT_HUB\\rnd\\src\\main\\java\\com\\iroshnk\\java\\json\\currency\\common_currency.json"),
                objectMapper.getTypeFactory().constructParametricType(List.class, Document.class)
        );

        int i = 2;
        for (Document o : items) {
            //System.out.println(o);

            String insert = "INSERT INTO CURRENCY (currency_id, currency_code, currency_name, status, symbol) VALUES ("
                    + i++ + ", '" + o.get("code") + "', '" + o.get("name") + "', 2, '" + o.get("symbol") + "');";

            System.out.println(insert);
        }
    }
}
