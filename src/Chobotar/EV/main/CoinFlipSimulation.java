package Chobotar.EV.main;

import java.util.Random;
/*
 Write some code that simulates flipping a single coin however many times the user decides. 
The code should record the outcomes and count the number of tails and heads.
*/
public class CoinFlipSimulation {

    private int tails = 0,
                heads = 0;
    public CoinFlipSimulation(int n) {
        Random random = new Random();
        
        while(n>0) {
            int result = random.nextBoolean()? heads++ : tails++;
            n--;
        }
        System.out.println(heads+" "+tails);
    }

}
