public class largestvaluearray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // - INFINITY

        for(int i = 0 ; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;   // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }

        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 5, 3, 7 ,4};
        System.out.println("largest value of array : " + getLargest(numbers));
        System.out.println("smallest value of array :" + getSmallest(numbers));

    }
}
