import java.util.Scanner;

public class Tax {


    public static void main(String[] args) {
        //Calculate Weekly Average tax withholding
        //Income less than 500 -> 10%
        //Income greater than/equal 500 less thank 1500 -> 15%
        //Income greater than/equal 1500 less thank 2500 -> 20%
        //Income greater than/equal 2500 -> 30%

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weekly income");
        double income = scan.nextDouble();
        double tax = 0.0;
        double totalTaxWithholding = 0.0;
        if(income < 500){
            tax = .10;
        } else if(income >= 500 && income < 1500){
            tax = .15;
        } else if(income >= 1500 && income < 2500){
            tax = .20;
        } else if(income > 2500){
            tax = .20;
        }
        totalTaxWithholding = income * tax;

        System.out.println("Your total tax withholding is: " + totalTaxWithholding);
    }
}
