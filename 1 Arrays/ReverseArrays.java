public class ReverseArrays {
    public static void reverse(int numbers[]) {
       int first = 0, End = numbers.length-1;
       while (first < End) {
          //swap
          int Temp = numbers [End];
          numbers[End] = numbers[first];
          numbers [first] = Temp;
         
        }
        first ++;
        End--;
    }

   public static void main(String args[]) {
      int numbers[] = {2,4,6,8,10,12,14,16};
      reverse(numbers);
      // print
      for(int i=0; i<numbers.length; i++){
         System.out.print(numbers[i] + "");
       }
       System.out.println();
    
   }
}
