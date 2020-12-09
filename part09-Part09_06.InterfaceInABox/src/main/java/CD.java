/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Am0rphic
 */
public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private double weight;
    
    public CD(String cdArtist, String cdName, int cdYear) {
        artist=cdArtist;
        name=cdName;
        year=cdYear;
        weight=0.1;
    }
    
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
    
}
