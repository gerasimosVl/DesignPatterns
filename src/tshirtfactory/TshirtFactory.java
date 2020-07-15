/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtfactory;

import tshirtfactory.product.Tshirt;

/**
 *
 * @author geras
 */
public class TshirtFactory {

    public static void main(String[] args) {
        
        CheckOut checkOut = new CheckOut();
        
        checkOut.addToCheckOut(new Tshirt());
        checkOut.addToCheckOut(new Tshirt());
        checkOut.addToCheckOut(new Tshirt());
        
        checkOut.printCheckOutContent();
        checkOut.paymentMenu();
    }
    
}
