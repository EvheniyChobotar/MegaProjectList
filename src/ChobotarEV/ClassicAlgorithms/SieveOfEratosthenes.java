package ChobotarEV.ClassicAlgorithms;

import java.util.ArrayList;
import java.util.List;

/*
The sieve of Eratosthenes is one of the most efficient ways to find all of the smaller primes (below 10 million or so).
*/

public class SieveOfEratosthenes {

    public SieveOfEratosthenes() {
        
        List<Integer> sieve =  new ArrayList<>();
        for(int i=6; i<1000000; i++) {
            if(i%2 == 0 || i%3 == 0 || i%5 == 0) {}
            else {
                sieve.add(i);
            }
        }
        
        for(int i=0;i<sieve.size()-2;i++){
            for(int j=i+1;j<sieve.size()-1;j++) {
                if(sieve.get(j)%sieve.get(i) == 0) {
                    sieve.remove(j); 
                }
            }
        }
        
        sieve.add(0,2);
        sieve.add(1,3);
        sieve.add(2,5);
        sieve.clear();

    }

}
