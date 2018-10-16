package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static String ERR_NOT_FOUND_EMPLOYEE = "Employee was not found after the given parameters. ";
    public static String ERR_NOT_FOUND_COMPANY = "Company was not found after the given parameters. ";
    public static String ERR_SUBSTRINGS_HAS_ZERO_LETTER = "The searched phrase has zero letter. ";

    public SearchException(String message) {
        super(message);
    }
}
