public class productfunction {

    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b= 5;
        int prod = multiply(a, b);
        System.out.println("product = " + prod);
        prod = multiply(5 , 20);
        System.out.println("product two" + prod);
    }
}
