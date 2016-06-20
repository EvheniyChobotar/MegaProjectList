package ChobotarEV.Numbers;
/*
Have the user enter a number and find all Prime Factors (if there are any) and display them.
*/
public class PrimeFactorization {

    public PrimeFactorization(int n) {
        for(int i = 1;i<=n;i++) {
            if(check(i)) System.out.print(" "+i);
        }
    }
    
    private boolean check(int a) {
        for(int i=2;i<a;i++) {
            if(a%i == 0) return false;
        }
        return true;
    }

}
