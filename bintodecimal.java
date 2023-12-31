public class bintodecimal {

    public static void binNum(int n)
    {
        int mynum = n;
        int pow = 0;
        int decNum = 0;
        while(n>0){
            int lastDigit = n%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2 , pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal of " + mynum + "=" + decNum);

    }




    public static void main(String[] args) {
        binNum(101);
    }
}
