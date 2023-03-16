package demo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *div sub mil 
 * define a 5
 * 
 * 
 * @author yo
 */
public class Calculator {
    
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<Double>();
        
        Scanner s = new Scanner(System.in);
        
        Map<String, Cmd> cmds = new HashMap<String, Cmd>();
        cmds.put("PUSH", new Push());
        cmds.put("ADD", new Add());
        cmds.put("PRINT", new Print());
        cmds.put("DIV", new Div());
        cmds.put("SUB", new Sub());
        cmds.put("MUL", new Mul());
        
        while(true) {
            String line = s.nextLine();
            
            String[] parts = line.split(" ");
            String cmdName = parts[0].toUpperCase();
            
            cmds.get(cmdName).exec(parts, stack);
        }
    }
    
}
