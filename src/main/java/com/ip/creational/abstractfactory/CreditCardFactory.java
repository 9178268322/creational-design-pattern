package com.ip.creational.abstractfactory;

/**
 * AbstractFactory.
 */
public abstract class CreditCardFactory {

    private static final int CREDIT_CARD_SCORE = 650;

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > CREDIT_CARD_SCORE) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
    public abstract Validator getValidator(CardType cardType);
}
