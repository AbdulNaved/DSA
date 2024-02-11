// Q: liner search in arrays

public class linersch {

    public static int linear_Serach (int numbers[], int key ){
        for (int i=0; i<numbers.length; i++) {
            if(numbers[i] == key ) {
                return i;
            }
        }
        return -1; //-1 is key not exist in array
    }

    public static void main (String args[]) {
      int numbers[] = {2,4,6,8,10,12,14,16};
      int key = 10;
      int index = linear_Serach(numbers, key);
      if (index == -1) {
         System.out.println("NOT FOUND");        
       }else{
        System.out.println("KEY IS AT INDEX:" + index);
       }
    }
    
}