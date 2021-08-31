/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date.time;

import java.util.Date;

/**
 *
 * @author pc-asus
 */
public class Test_001time {
    
    public static void main(String[] args) {
        
        Date d = new Date();
        
        double seconds = d.getTime()/ 1000;
        double minutes = seconds/ 60;
        double hours = minutes/ 60;
        double days = hours/ 24;
        double months = days/ 30;
        double years = days/ 365;
        
        System.out.println("Since 05:00:00 of the 1.Aug, 1998, it's been...");
        System.out.println(seconds + "seconds OR");
        System.out.println(minutes + "minutes OR");
        System.out.println(hours + "hours OR");
        System.out.println(days + "days OR");
        System.out.println(months + "months OR");
        System.out.println(years + "years OR");
    }
    
}
