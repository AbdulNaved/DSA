public class Selection_Sort {

    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minposition = i;
            for(int  j=j+1; j<arr.length-1; j++ ){
                if(arr[minposition] > arr[j]){
                    minposition = j;
                }
            }
            //swap
            int Temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = Temp;   
        }
       

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
        printArr(arr);
    }
}