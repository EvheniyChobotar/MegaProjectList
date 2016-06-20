package ChobotarEV.Numbers;
import java.util.Scanner;
/*
 Have the program find prime numbers until the user chooses to stop asking for the next one.
*/

public class NextPrimeNumber {

    public NextPrimeNumber() {
        primeNumbers();
    }
    
    private void primeNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 1;;i++) {
            if(check(i)) {
                
                System.out.println(" "+i+"\nEnter 1 for next one,2 for quit");
                
                if(scanner.nextInt() == 2) { 
                    System.exit(0);
                    scanner.close();
                }
            }
        }
        
    }
    
    private boolean check(int a) {
        for(int i=2;i<a;i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
}
