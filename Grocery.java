import java.text.DecimalFormat;
import java.util.Scanner;

public class Grocery {
    //Ask for the coupon amount as a decimal
    //Ensure the value is atleast  10% if the value exceeds 100% or is less than 0
    //1 - 4 weeks of grocery bill
    //Calculate monthly total and weekly average
    //monthly & weekly with & w/o a coupon

    public static void main(String[] args) {
        //User Input
        Scanner scan = new Scanner(System.in);
        //Format decimal places
        DecimalFormat df = new DecimalFormat("0. 00");
        //Simple styling effect
        System.out.println("****WELCOME TO THE GROCERY CALCULATOR****");
        System.out.println("");
        //Capture coupon amount from user
        System.out.println("Please enter your coupon amount: (Please enter a number between .10 & .99)");
        double coupon = scan.nextDouble();
        System.out.println("");
        //Create an array of weekly grocery amounts
        double[] weeklyGroceryAmount = new double[4];
        for(int i = 0; i < 4; i++){
            //Ask the user for weekly grocery amount
            System.out.println("Please enter your week " + (i + 1) + " grocery total");
            weeklyGroceryAmount[i] = scan.nextDouble();
        }
        System.out.println("***************");
        //Display Weekly Average & Monthly Total
        System.out.println("Your Monthly total is: " + df.format(weeklyTotal(weeklyGroceryAmount)));
        System.out.println("Your Weekly average is: " + df.format(weeklyTotal(weeklyGroceryAmount) / 2));
        // System.out.println("Your Monthly total including discount is " + df.format(couponDiscount(coupon, weeklyTotal(weeklyGroceryAmount))));
        System.out.println("Your Monthly total including discount is: " + df.format(couponDiscount(coupon, weeklyTotal(weeklyGroceryAmount))));
        System.out.println("Your Weekly average including discount is: " + df.format(couponDiscount(coupon, weeklyTotal(weeklyGroceryAmount) / 4)));

    }
    public static double weeklyTotal(double[] weekTotal){
        double total = 0.0;
        for(int i = 0; i < weekTotal.length; i++){
            total += weekTotal[i];
        }
        return total;
    }

    public static double couponDiscount(double coupon, double weeklyTotal){
        double total = 0.0;
        if(coupon > 100 || coupon < 0){
            coupon = .10;

        }
        total = weeklyTotal - (weeklyTotal * coupon);
        return total;
    }




}
