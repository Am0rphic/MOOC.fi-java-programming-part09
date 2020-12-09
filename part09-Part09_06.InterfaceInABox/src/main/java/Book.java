/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Am0rphic
 */
public class Book implements Packable {


    private String author;
    private String name;
    private double weight;
    
    public Book(String bookAuthor, String bookName, double bookWeight) {
        this.author=bookAuthor;
        this.name=bookName;
        this.weight=bookWeight;
    }
    
    public double weight(){
        return this.weight;
    }
    @Override
    public String toString() {
        return author + ": " + name;
    }
}
