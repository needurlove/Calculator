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
public class Add implements Cmd{
    @Override
    public void exec(String parts[], Stack<Double> stack) {
        stack.push(stack.pop() + stack.pop());
    }
}
