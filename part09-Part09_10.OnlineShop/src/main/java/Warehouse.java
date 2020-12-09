/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Warehouse {
    private Map<String,Integer> mapPrice;
    private Map<String,Integer> mapStock;
    
    public Warehouse() {
        this.mapPrice=new HashMap<>();
        this.mapStock=new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        mapPrice.putIfAbsent(product, price);
        mapStock.putIfAbsent(product, stock);
    }
    
    public int price(String product) {
        if (mapPrice.containsKey(product)) {
            return mapPrice.get(product);
        }
        return -99;
    }
    public int stock(String product) {
        if (mapStock.containsKey(product)) {
            return mapStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (!mapStock.containsKey(product)) {
            return false;
        }
        if (mapStock.get(product)==0) {
            return false;
        }
        mapStock.replace(product, mapStock.get(product), mapStock.get(product)-1);
        if (mapStock.get(product)>0) {
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return mapStock.keySet();
    }
    
    
}
