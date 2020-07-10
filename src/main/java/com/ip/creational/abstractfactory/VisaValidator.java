package com.ip.creational.abstractfactory;

/**
 * This is the visa validator.
 */
public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
