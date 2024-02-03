package com.hpa.util;

import java.security.SecureRandom;

public class DataGenerator {

    private static final String[] FIRST_NAMES = {"Aditya", "Amit", "Ananya", "Deepak", "Divya", "Gaurav", "Isha", "Kavita", "Manish", "Neha", "Pooja", "Rahul", "Rajesh", "Ritu", "Sandeep", "Sanjay", "Shreya", "Sneha", "Suman", "Varun"};
    private static final String[] LAST_NAMES = {"Agarwal", "Bansal", "Chopra", "Datta", "Gupta", "Jain", "Kumar", "Mehta", "Mishra", "Patel", "Rao", "Sethi", "Sharma", "Singh", "Tiwari", "Verma"};

    private static final String[] EMAIL_PROVIDERS = {"gmail.com", "yahoo.com", "outlook.com", "hotmail.com", "aol.com", "icloud.com"};

    public static String generateRandomName() {
        SecureRandom random = new SecureRandom();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        return firstName + " " + lastName;
    }

    public static String generateRandomEmail() {
        SecureRandom random = new SecureRandom();
        return EMAIL_PROVIDERS[random.nextInt(EMAIL_PROVIDERS.length)];
    }

    public static String generateRandomMobileNumber() {
        SecureRandom random = new SecureRandom();
        StringBuilder mobileNumber = new StringBuilder("+91"); // Indian country code
        for (int i = 0; i < 10; i++) {
            mobileNumber.append(random.nextInt(10));
        }
        return mobileNumber.toString();
    }

    public static void main(String[] args) {
        String randomName = generateRandomName();
        String randomEmail = generateRandomEmail();
        String randomMobileNumber = generateRandomMobileNumber();

        System.out.println("Random Name: " + randomName);
        System.out.println("Random Email: " + randomEmail);
        System.out.println("Random Indian Mobile Number: " + randomMobileNumber);
    }
}
