/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pagodalabs.commandexample.commands;

import static java.lang.Math.pow;

/**
 *
 * @author Raju
 */
public class ExponentCommand extends Command {

    @Override
    public double execute(double x, double y) {
        return pow(x,y);
    }
    
}
