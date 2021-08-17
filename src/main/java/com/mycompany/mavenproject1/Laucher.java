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
public class Laucher {
    
  static int  operate(int operand11, operand22, InterfaceFonctionel1 myInterface ) {
    return myInterface.operation(operand11, operand22);
}
  public static main(string arg[]){
      
      InterfaceFonctionel1 add = (int x, int y)->x+y;
      
      InterfaceFonctionel1 multiply = (int x, int y)->x*y;
      
      int resultAdd = operate(2,8 add);
      
        int resultMultiply = operate(2,8 multiply);
        
        System.out.println();
  }
}