import java.util.Scanner;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if(income<500000){
            System.out.println("No tax");

        } else if (500000>income && income>1000000) {

            double tax = income*0.2;

            System.out.println(tax);

        }
        else{
            double tax = income*0.3;
            System.out.println(tax);
        }
    }
}
