package com.selenide;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Customers;
import com.model.Employees;
import modelabstract.Basic;

import java.io.File;
import java.io.IOException;

public class JsonToJavaConverter {


    public static void main(String[] arg) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //   File f = new File("src/main//resources/json/employee.json");
        File f = new File("src/main//resources/json/customer.json");
        System.out.println("f1 = " + f.getAbsolutePath());
        /*Employees employees = objectMapper.readValue(f, Employees.class);
        System.out.println("employees = " + employees.getEmployees().get(0).firstName);*/
        Customers customers = (Customers) getData(new Customers(), f);
        System.out.println("customers = " + customers.getCustomer().address.streetAddress);
        f = new File("src/main//resources/json/employee.json");
        Employees employees = (Employees) getData(new Employees(), f);
        System.out.println("employees = " + employees.getEmployees().get(0).emailAddress);

    }

    private static Object getData(Object tClass, File f) throws IOException {
        return new ObjectMapper().readValue(f, tClass.getClass());
    }

/*
    public <T extends Basic>  getData(<T extends Basic> tClass,File f) throws IOException {
        Basic b = (Basic) new ObjectMapper().readValue(f, tClass);
        return b;

    public <T extends Basic> Basic fromArrayToList(TypeReference<T> a, File f) {
       return  (Basic) new ObjectMapper().readValue(f, a);
    }
*/

/*    public Basic<T> read(InputStream json, Class<T> contentClass) throws IOException {
        JavaType type =  new ObjectMapper().getTypeFactory().constructParametricType(Basic.class, contentClass);
        return  new ObjectMapper().readValue(json, type);
    }*/
}
