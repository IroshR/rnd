package com.iroshnk.java.json;

/**
 * Created by HP on 1/8/2018.
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperDemo {

    public Employee readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee emp = objectMapper.readValue(new File("D:\\Learning\\java_8\\example\\src\\main\\java\\com\\iroshnk\\java\\json\\employee.json"), Employee.class);
        System.out.println(emp.toString());
        return emp;
    }

    public static void main(String[] args) throws Exception{
        Employee employee = new  ObjectMapperDemo().readJsonWithObjectMapper();
    }

}
