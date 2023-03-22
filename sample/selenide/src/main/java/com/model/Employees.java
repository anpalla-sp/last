package com.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Tolerate;
import modelabstract.Basic;

import java.util.ArrayList;

@Data
@Builder
@ToString
public class Employees {

    public ArrayList<Employee> employees;

    @Tolerate
    public Employees(){

    }

    public static class Employee{
        public String userId;
        public String jobTitleName;
        public String firstName;
        public String lastName;
        public String preferredFullName;
        public String employeeCode;
        public String regions;
        public String phoneNumber;
        public String emailAddress;

        @Tolerate
        public Employee(){

        }
    }
}



