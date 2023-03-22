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
public class Customers {

    public Customer customer;

    public static class Customer {
        public String firstName;
        public String lastName;
        public int age;
        public Address address;
        public ArrayList<PhoneNumber> phoneNumber;

        @Tolerate
        public Customer() {

        }

    }

    @Tolerate
    public Customers() {

    }

    public static class Address {
        public String streetAddress;
        public String city;
        public String state;
        public String postalCode;

        @Tolerate
        public Address() {

        }
    }

    public static class PhoneNumber {
        public String type;
        public String number;

        @Tolerate
        public PhoneNumber() {

        }
    }

}
