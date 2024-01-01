public class binarysearch {

    public static int binarysearch(int numbers[] , int key){
        int start = 0 , end = numbers.length-1;
        while (start<= end){
            int mid = (start+end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 5, 6, 8, 9} ;
        int key = 5;
        System.out.println("index of key value:" + binarysearch(numbers , key));
    }
}
