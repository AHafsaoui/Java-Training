package com.mycompany.mavenproject1;


import com.mycompany.mavenproject1.FigureGeo;


/**
 *
 * @author pc-asus
 */
public class carre extends FigureGeo {
 
    private long cote;
    public long getCote() {
        return cote;
    }
    public long getPerimetre(){
        return 4*cote;
    }
}