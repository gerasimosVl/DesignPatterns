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
public class BankTransferPayment implements PaymentMethod {
    private String accountName;
    private String accountNumber;

    public BankTransferPayment(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid amount: " + amount + "€" + " with details:\n " + this);
    }

    @Override
    public String toString() {
        return "Bank Transfer Payment{" + "Account Name= " + accountName + ", Account Number= " + accountNumber + '}';
    }
    
    
}
