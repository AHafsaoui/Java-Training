/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datecal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author pc-asus
 */
public class Datetest_01 {
    public static void main (String[] args) {
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        
        String firstDate = "31/08/2021";
        String secondDate = "01/10/2021";
        
        LocalDate date1 = LocalDate.parse(firstDate, Formatter);
         LocalDate date2 = LocalDate.parse(secondDate, Formatter);
         
         long daysBetween = ChronoUnit.DAYS.between(date1,date2);
         
         System.out.println(daysBetween);
                
    }
    
    
}
