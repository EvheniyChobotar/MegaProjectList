package ChobotarEV.Numbers;

import java.util.Scanner;

/*
Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given interest rate. 
Also figure out how long it will take the user to pay back the loan. For added complexity, 
add an option for users to select the compounding interval (Monthly, Weekly, Daily, Continually).
*/
public class MortgageCalculator {
    private final int   term,
                        interestRate;
    private final float primeContribution;
    private float       mortgage;

    public MortgageCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum of mortgage: " );         this.mortgage = scanner.nextFloat();
        System.out.println("Enter prime contribution"
                      + "(must be < sum of mortgage): " );      this.primeContribution = scanner.nextFloat();
        System.out.println("Enter interest rate(0-100%): " );   this.interestRate = scanner.nextInt();
        System.out.println("Enter credit period(month): " );    this.term = scanner.nextInt();
        System.out.println("Monthly payment: " + calculateMonthlyPayment()); 
    }
    
    private float calculateMonthlyPayment() {
        mortgage -= primeContribution;
        float  montlyShare = mortgage/term;
        float  monthlyPayment = (montlyShare+montlyShare*interestRate/100.0f);
        System.out.println("Overpayment: "+(((mortgage/term/100.0f*interestRate)*term)));
        return monthlyPayment;
    }
}
