/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.commandexample.commands;

import java.util.HashMap;

/**
 *
 * @author Raju
 */
public class CommandFactory {
     private final HashMap<String,Command> commands = initialize();
     
     private HashMap<String, Command> initialize(){
         HashMap<String, Command> c = new HashMap<>();
        c.put("+", new AddCommand());
        c.put("-", new SubCommand());
        c.put("*", new MulCommand()); 
        c.put("/", new DivCommand()); 
        c.put("max", new MaxCommand());
        c.put("pow", new ExponentCommand());
         return c;
     }
     
    public Command getCommand(String key){
        if (isCommand(key)){
            return (Command)commands.get(key);
        }
            return null;
}
    public Boolean isCommand(String key){
        return commands.containsKey(key);
    }
}