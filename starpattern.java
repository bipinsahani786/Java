import java.util.Scanner;

public class starpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        for(int line = 1 ; line<=i ; line++ ){
            for(int star = 1 ; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
