package Chobotar.EV.main;
/*
A simple calculator to do basic operators. Make it a scientific calculator for added complexity.
*/
import java.util.Scanner;

public class Calculator {
    
    private String  operation = "";
    private float   result;
    private Scanner scanner;
    
    public Calculator() {
        System.out.println("Enter your operation!\n");
        scanner = new Scanner(System.in);
        this.result = scanner.nextFloat();
        while(!operation.equals("=")) {
            
            operation = scanner.next();
            if(operation.equals("*"))
                result *= scanner.nextFloat();
            if(operation.equals("/")) 
                result /= scanner.nextFloat();
            if(operation.equals("+")) 
                result += scanner.nextFloat();
            if(operation.equals("-")) 
                result -= scanner.nextFloat();
        }
        System.out.println("Result: "+result);
    }
    
}
