import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int n = sc.nextInt();
        if(n==2){
            System.out.print("Prime");
        }
        else{
            boolean isPrime = true;
            for(int i = 2 ; i<=Math.sqrt(n); i++){
                if(n%i ==0){

                    isPrime = false;
                }

            }
            if(isPrime == true){
                System.out.println("Prime");

            }
            else{
                System.out.println("Not prime");
            }
        }

    }
}
