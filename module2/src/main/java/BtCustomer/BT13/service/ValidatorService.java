package BtCustomer.BT13.service;

import BtCustomer.BT13.exception.BirthDayException;
import BtCustomer.BT13.exception.EmailException;
import BtCustomer.BT13.exception.FullNameException;
import BtCustomer.BT13.exception.PhoneException;

import java.time.LocalDate;

public class ValidatorService {

    public static void birthdayCheck(LocalDate birthday) throws BirthDayException {
        // TODO HERE
    }

    public static void phoneCheck(String phone) throws PhoneException {
        // TODO HERE
    }

    public static void emailCheck(String email) throws EmailException {
        // TODO HERE
    }

    public static void nameCheck(String name) throws FullNameException {
        // TODO HERE
    }
}