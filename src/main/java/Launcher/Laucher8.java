/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launcher;

import Launcher.InterfaceFonctionel_2;
import Launcher.InterfaceFonctionel_1;

/**
 *
 * @author pc-asus
 */
public class Laucher8 {
    
  static int  operate(int operand11, operand22, InterfaceFonctionel_1 myInterface ) {
      operand2 operand22;
    return myInterface.operation(operand11, operand22);
}
  public static Laucher8(string arg[]){
      
      InterfaceFonctionel_1 add = (int x, int y)->x+y;
      
      InterfaceFonctionel_1 multiply = (int x, int y)->x*y;
      
      int resultAdd = operate(2,8 add);
      
        int resultMultiply = operate(2,8 multiply);
        
        System.out.println("resultat de addition = " + resultAdd);
        
        System.out.println("resultat de multiplication = " + resultMultiply);
        InterfaceFonctionel_2 fog = (string message) -> {System.out.println("Hello" + message);};
        fog.SayMessage("Good Game");
  }    

    private static int operate(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class operand22 {

        public operand22() {
        }
    }

    private static class string {

        public string() {
        }
    }
}