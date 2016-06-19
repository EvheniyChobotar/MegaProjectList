package Chobotar.EV.main;

/*
Ask the user to enter 2 integers a and b and output a^b (i.e. pow(a,b)) in O(lg n) time complexity.
*/

public class FastExponentiation {

    public FastExponentiation(int a,int n) {
        int result = 1;
	while (n>0) {
            if(n%2==1)
                result *= a;
            a *= a;
            n >>= 1;
	}
        System.out.println(result);
    }
}
