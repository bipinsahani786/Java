public class maxsumsubarray {

    public static void max_sub_array(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length; i++)  {
            for(int j = i ; j<numbers.length; j++){
                currsum = 0;
                for (int k = i ; k<=j ; k++){
                    System.out.print(numbers[k] + " ");

                    currsum+=numbers[k];
                }
                System.out.println();
            }
            System.out.println(currsum);
            if(maxsum<currsum)
            {
                maxsum=currsum;

            }
        }
        System.out.println("maxsum is = " + maxsum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        max_sub_array(numbers);
    }
}
