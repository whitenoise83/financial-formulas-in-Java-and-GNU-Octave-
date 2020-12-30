
import java.util.Scanner;

public class FutureValue {

    private double PV; //The present value of money (The value of initial capital)
    private double IY; //Periodic Interest Rate (r)
    private int N; //Number of compounding periods
    private double FV; //Future value of the money

    /*
    ***********************************************************************************************
    ***********************************************************************************************
    Example-1: What is the futute value of $ 1000 in two years with a yearly interest rate of %6 ?
    PV = $ 1000
    I/Y = 0.06 (yearly interest rate)
    N = 2 years
    ***********************************************************************************************
    ***********************************************************************************************
    Example-2: What is the futute value of $ 1000 in three months with a yearly interest rate of %6 ?
    PV = $ 1000
    I/Y = 0.06/12 = 0.005 (monthly interest rate)
    N = 3 months
    ***********************************************************************************************
    ***********************************************************************************************
     */
    //Method for calculating the future value of the money:  
    public void futureValueCalculator() {
        Scanner scanner = new Scanner(System.in);
        FV = 0;

        System.out.print("Please enter the amount of your initial capital: ");
        PV = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please enter the value of periodic interest rate [Example: For 6% interest rate type the value as '0.06']: ");
        IY = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Please enter the number of coumpounding periods: ");
        N = scanner.nextInt();
        scanner.nextLine();

        double temp = (1 + IY);
        FV = (PV * Math.pow(temp, N));

        System.out.println("Your money will be equal at $ " + FV);

    }

    /*
    //Here the GNU Octave function for the same problem:
    function [FV] = futureValue(PV, IY, N)
    FV = PV * (1 + IY)^N;
    endfunction
    */
    
}
