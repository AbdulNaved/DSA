public class InsertionSort {

    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int Curr = arr[i];
            int Prev = i-1;

            // finding out correct pos t0 insert

            while (Prev >= 0 && arr[Prev] > Curr) {
                arr[Prev + 1] = arr[Prev];
                Prev--;
            }

            //insertion 
            arr[Prev+1] = Curr;
        }

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.err.println();
           
    }

    public static void main(String[] args) {
      int arr[] = {5,4,1,3,2};
      InsertionSort(arr);
      printArr(arr);
    }
}
