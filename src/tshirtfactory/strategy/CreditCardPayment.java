/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtfactory.strategy;

/**
 *
 * @author geras
 */
public class CreditCardPayment implements PaymentMethod {
    
    private String cardType; // example MasterCard, Visa etc
    private String cardNumber;
    private String cvvCode;
    private int expirationDate;

    public CreditCardPayment(String cardType, String cardNumber, String cvvCode, int expirationDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cvvCode = cvvCode;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Total Paid amount: " + amount + "€" + " with details:\n " + this);
    }
    
   

    @Override
    public String toString() {
        return "Credit Card Payment{" + "Card Type= " + cardType + ", Card Number= " + cardNumber + ", CVV Code= " + cvvCode + ", expiration Date= " + expirationDate + '}';
    }
    
    
    
}
