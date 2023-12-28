import java.util.Scanner;

public class sumnaturalnumbers {
    public static void main(String[] args) {
        int sum , n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        n = sc.nextInt();
        sum = 0;
        int i = 0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
