package ChobotarEV.Numbers;
/*
 A happy number is defined by the following process. Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers,
while those that do not end in 1 are unhappy numbers. Display an example of your output here. Find first 8 happy numbers.
*/
public class HappyNumbers {

    public HappyNumbers(int number) {
        System.out.println(number + " is happy number? "+isHappy(number));
        System.out.println("Ok,lets find first happy 8 numbers");
        for(int i=0, count=0;count<8;i++) {
            if(isHappy(i)) { count++; System.out.println(i); }
        }
    }
    
    private boolean isHappy(int number) {
        int tmp;
        int count = 100000;
        while(count > 0) {
            tmp = 0;
            while(number != 0) {
                tmp += (number%10)*(number%10);
                number /= 10;
            }
            number = tmp;
            count--;
            if(number == 1) return true;
        }
        return false;
    }
}
