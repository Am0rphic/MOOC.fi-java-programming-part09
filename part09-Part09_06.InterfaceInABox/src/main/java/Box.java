/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box (double maxWeight) {
        this.capacity=maxWeight;
        this.items=new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (this.capacity-item.weight()>=0) {
            items.add(item);
            this.capacity-=item.weight();
        }
    }
    
    public double weight() {
        double w=0;
        for (Packable item:items) {
            w+=item.weight();
        }
        return w;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, " + "total weight " + weight() + " kg";
    }
    
    
}
