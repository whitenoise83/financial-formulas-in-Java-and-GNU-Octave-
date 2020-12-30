
import java.util.Scanner;


public class PresentValue {
    private double FV; //The future value of money
    private double IY; //Periodic interest rate
    private int N; //Number of compounding periods
    private double PV; //Present value of money
        
     /*
    ***********************************************************************************************
    ***********************************************************************************************
    Example-1: What is the present value of one year later's $ 106 in today with a yearly interest rate of %6 ?
    I/Y = 0.06 (yearly interest rate)
    N = 1 year
    ***********************************************************************************************
    ***********************************************************************************************
    Example-2: What is the present value of 3 months later's $ 2055 with a yearly interest rate of %6 ?
    FV = $ 2055
    I/Y = 0.06/12 = 0.005 (monthly interest rate)
    N = 3 months
    ***********************************************************************************************
    ***********************************************************************************************
     */
    //Method for calculating the present value of the money:  
    
    
    public void presentValueCalculator(){
        Scanner scanner = new Scanner(System.in);
        PV = 0;
        
        System.out.print("Please enter the future value of your capital : ");
        FV = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Please enter the periodic interest rate : ");
        IY = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Please enter the number of compounding period : ");
        N = scanner.nextInt();
        scanner.nextLine();
        
        double temp = (1 + IY);
        PV = FV / Math.pow(temp, N);
        
        System.out.print("Your money is equal at : " + PV);
        

    
}
    
    
    
    
}
