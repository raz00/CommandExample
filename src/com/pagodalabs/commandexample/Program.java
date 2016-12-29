/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.commandexample;


import com.pagodalabs.commandexample.commands.Command;
import com.pagodalabs.commandexample.commands.CommandFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Raju
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
       CommandFactory factory = new CommandFactory();
       
       BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter num 1.");
       double x= Double.parseDouble(reader.readLine());
       System.out.println("Enter num 2.");
       double y= Double.parseDouble(reader.readLine());
       
       System.out.println(" 1. Press + for ADD.");
       System.out.println(" 2. Press - for SUB.");
       System.out.println(" 3. Press * for MUL.");
       System.out.println(" 4. Press / for DIV.");
       System.out.println(" 5. Press max for MAX.");
       System.out.println(" 6. Press pow for EXPONENT");
       
      String command = reader.readLine();
        
      Command c = factory.getCommand(command);
      if(c!= null ){
        System.out.println(c.execute(x,y));
       }
      else
      {
          System.out.println(" Wrong Choice");
      }
    }
}