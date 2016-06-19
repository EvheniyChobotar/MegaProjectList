package Chobotar.EV.main;
/*
 Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.


*/
public class FibonacciSequence {

    public FibonacciSequence(int n) {
        long a1 = 0, a2 = 1;
        while(n>1) {
            a1 += a2;
            a2 = a1 - a2;
            a1 = a1 - a2;
            n--;
            System.out.print(" "+(a2 += a1));
        }
    }
}
