/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtfactory;

import static java.text.BreakIterator.DONE;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tshirtfactory.product.Tshirt;
import tshirtfactory.strategy.BankTransferPayment;
import tshirtfactory.strategy.CashPayment;
import tshirtfactory.strategy.CreditCardPayment;
import tshirtfactory.strategy.PaymentMethod;

/**
 *
 * @author geras
 */
public class CheckOut {
    
    private List<Tshirt> product;
    PaymentMethod method;
    
    private double checkOutCost;

    public CheckOut() {
        product = new ArrayList();
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }
    
    public void addToCheckOut(Tshirt tshirt) {
        product.add(tshirt);
    }

   
    public double calculateCartCost() {
        checkOutCost = 0;
        for (Tshirt s : product) {
            checkOutCost += s.getPrice();
        }
        return checkOutCost;
    }
    
    public void checkOut() {
        method.pay(checkOutCost);
    }
    
    public void printCheckOutContent() {
        for(Tshirt s: product) {
         System.out.println(s);
        }
    }
    
    public void paymentMenu(){
        System.out.println("Total cost is: " + calculateCartCost() + "€");  
        PaymentMethod payment = null;
        Scanner s = new Scanner(System.in);    
        while (true) {
        System.out.println("How would you like to pay?");
        System.out.println("1. Credit Card");
        System.out.println("2. Bank transfer");
        System.out.println("3. Cash");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                payment = new CreditCardPayment("Master Card", "4569 7841 9874 0047", "123", 2023);
                break;
            case 2:
                payment = new BankTransferPayment("Gerasimos Vlachopoulos", "GR00456792116");
                break;
            case 3:
                payment = new CashPayment();
                break;
           default:
            System.out.println("This is not an option! Choose a valid option please!");
            continue;
            case DONE:
        break;
        }
        break;      
        }
        
        setMethod(payment);
        checkOut();   
    
    }
}
