/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author pc-asus
 */
public class Test_1 {
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 8, 31);
        LocalDateTime dt = date.atTime(15, 47, 00);
        System.out.println(date.plusYears(6));
        System.out.println(dt);
        
       
        
        
    }
}
