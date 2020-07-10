package com.ip.creational.abstractfactory;

/**
 * This is the validator for american express gold credit card.
 */
public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
