import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("length of array : " + marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy = " + marks[0]);
        System.out.println("chem =" + marks[1]);
        System.out.println("maths = " + marks[2]);

        float percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = " + percentage);
    }
}
