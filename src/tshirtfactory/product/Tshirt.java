/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtfactory.product;

import java.util.Objects;
import java.util.Random;
import tshirtfactory.enums.Color;
import tshirtfactory.enums.Fabric;
import tshirtfactory.enums.Size;

/**
 *
 * @author geras
 */
public class Tshirt {
    
    private Color color;
    private Size size;
    private Fabric fabric;
    private String name;
    private double price;
    private static String [] names;
    
    static {
        names = new String [] {"Polo", "Lacoste", "Tommy"};
    }


    public Tshirt() {
        this.name = randomName();
        this.color = randomColor();
        this.size = randomSize();
        this.fabric = randomFabric();
        this.price = calculatePrice();
    }   
    
    
     public Tshirt(Color color, Size size, Fabric fabric, String name, double price) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
        this.name = name;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String[] getNames() {
        return names;
    }

    public static void setNames(String[] names) {
        Tshirt.names = names;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + Objects.hashCode(this.size);
        hash = 17 * hash + Objects.hashCode(this.fabric);
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tshirt other = (Tshirt) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

    private String randomName() {
       Random random = new Random();
       
       return names[random.nextInt(names.length)];
    }
   
    
    private Color randomColor() {
        Random random = new Random();
        
        int choise = random.nextInt(Color.values().length);
        return Color.values()[choise];
    }

    
    private Size randomSize() {
           Random random = new Random();
        
        int choise = random.nextInt(Size.values().length);
        return Size.values()[choise];
    }

    
    private Fabric randomFabric() {
         Random random =  new Random();
         
         int choise = random.nextInt(Fabric.values().length);
         return Fabric.values()[choise];
    }

    
    private double calculatePrice() {
        double weight = 0.5;
        double totalPrice = 30;
        
        totalPrice += this.color.ordinal()/weight;
        totalPrice += this.size.ordinal()/weight;
        totalPrice += this.fabric.ordinal()/weight;
        
        return totalPrice;
    }
    

    @Override
    public String toString() {
        return "Tshirt{" + "color=" + color + ", size=" + size + ", fabric=" + fabric + ", name=" + name + ", price=" + price + '}';
    }  
    
    
}
