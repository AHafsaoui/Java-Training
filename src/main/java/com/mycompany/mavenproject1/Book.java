/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author pc-asus
 */
public class Book {

    public Book(String title2) {
        title = title2;
    }

    // Book properties
    String title;

    String author;

    int numberofpages;

    String publisher;

    public static void main(String[] args) {
        Book mybook = new Book ("Sword of Destiny", "Andrzej Sapkowski", 384);
    }

    private Book(String sword_of_Destiny, String andrzej_Sapkowski, int i) {
   author=andrzej_Sapkowski; }

}
