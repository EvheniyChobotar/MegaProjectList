package ChobotarEV.ClassicAlgorithms;
/*
Start with a number n > 1. Find the number of steps it takes to reach one using the following process: If n is even, 
divide it by 2. If n is odd, multiply it by 3 and add 1.
*/
public class CollatzConjecture {

    public CollatzConjecture(int n) {
        int count;
        for(count=0; n>1; count++) {
            if(n%2==0) n>>=1;
            else n=(n<<1)+(n+1);
        }
        System.out.println("Steps: "+count);
    }

}
