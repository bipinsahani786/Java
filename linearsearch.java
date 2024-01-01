public class linearsearch{

    public static int linear_search(int number[] , int key){
        for(int i = 0 ; i< number.length ; i++){
            if(number[i] == key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,3,5,6,4,9,10};
        int key = 4;

        int index = linear_search(number, key);

        if(index == -1){
            System.out.println("Not found a key");
        }
        else{
            System.out.println(index);
        }
    }
}
