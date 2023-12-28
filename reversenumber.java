public class reversenumber {
    public static void main(String[] args) {
        for(int i = 12345 ; i>0 ; i = i/10){
            int lastdigit = i%10;
            System.out.print(lastdigit);
        }
    }
}
