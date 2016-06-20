package ChobotarEV.Numbers;
/*
    The Factorial of a positive integer, n, is defined as the product of the sequence n, n-1, n-2, ...1 
and the factorial of zero, 0, is defined as being 1. Solve this using both loops and recursion.
*/
public class FactorialFinder {

    private int factorial = 1;
    public FactorialFinder(int n) {
        
        System.out.println(factorialRecursive(1,n));
        
        while(n>0) {
            factorial*=n;
            n--;
        }
        System.out.println(factorial);
    }
    
    private int factorialRecursive(int factorial,int n) {
        if(n>0) return factorialRecursive(factorial*n, n-=1);
        else return factorial;
    }

}
