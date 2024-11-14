package commission;

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {
        // Declare the variable
        double baseSalary = 600.00;
        double commissionrate = 0.5;
        double grossSales;
        double commission;
        double totalEarnings;
        Scanner input = new Scanner(System.in);
        
        //Ask the use to enter the gross sales for this week
        System.out.print("Enter the total gross for this week (in RM): ");
        grossSales = input.nextDouble();
        
        //Calculate the commission 
        commission = grossSales * commissionrate;
        
        //Calculate total earnings
        totalEarnings = baseSalary + commission;
        
        //Display the total earnings for this week 
        System.out.println("Total earnings for this week: RM"+totalEarnings);
        System.out.println("Commission you get is: RM"+commission);
    }
    
}
