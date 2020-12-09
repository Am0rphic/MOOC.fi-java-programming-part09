/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes=new ArrayList<>();
    }
    
    public void add(double status) {
        changes.add(status);
    }
    
    public void clear() {
        changes.clear();
    }
    public double maxValue() {
        double max=0;
        if (changes.isEmpty()) {
            return 0;
        }
        for (Double c:changes) {
            if (c>max) {
                max=c;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min=changes.get(0);
        if (changes.isEmpty()) {
            return 0;
        }
        for (Double c:changes) {
            if (c<min) {
                min=c;
            }
        }
        return min;
    }
    
    public double average() {
        double sum=0;
        if (changes.isEmpty()) {
            return 0;
        }
        for (Double c:changes) {
            sum+=c;
        }
        return sum/changes.size();
    }
    //weird magic expected
    @Override
    public String toString() {
        return changes.toString();
    }
    
    
    
}
