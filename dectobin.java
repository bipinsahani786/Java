public class dectobin {

    public static void decimaltoBinary(int n){
        int decimal = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println(" binary form " + decimal + "=" + binNum);
    }




    public static void main(String[] args) {
        decimaltoBinary(5);

    }
}
