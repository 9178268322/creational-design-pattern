package com.ip.creational.abstractfactory;

/**
 * This is the validator for american express platinum card.
 */
public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
