/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> organisms;
    
    public Herd() {
        this.organisms=new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public String toString() {
        return "\n" + organisms;
    }

    
    
    
    
    
    public void move(int dx, int dy) {
        for (Movable o:organisms) {
            o.move(dx, dy);
        }
    }
}
