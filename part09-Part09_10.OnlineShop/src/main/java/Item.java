/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Am0rphic
 */
public class Item {
    private String name;
    private int quantity;
    private int price;
    
    public Item (String productName, int qty, int price) {
        this.name=productName;
        this.quantity=qty;
        this.price=price;
    }
    
    public int price() {
        return this.price*this.quantity;
    }
    public void increaseQuantity() {
        this.quantity+=1;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.quantity;
    }
    
}
