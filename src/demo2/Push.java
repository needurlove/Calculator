/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo2;

import java.util.Stack;

/**
 *
 * @author yo
 */
public class Push implements Cmd{
    @Override
    public void exec(String parts[], Stack<Double> stack) {
        stack.push(Double.valueOf(parts[1]));
    }
}
