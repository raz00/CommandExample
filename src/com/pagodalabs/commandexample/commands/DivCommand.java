/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.commandexample.commands;

/**
 *
 * @author Raju
 */
public class DivCommand extends Command{

    @Override
    public double execute(double x, double y) {
     return x/y;   
    }
    
}
