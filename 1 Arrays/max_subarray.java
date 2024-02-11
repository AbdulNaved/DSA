public class max_subarray{
    public static void max_subaarays(int numbers[]){
        int Currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=1; i<numbers.length; j++){
                int end =j;
                Currsum =0;
                for(int k=start; k<=end; k++){
                    //subarray sum
                    Currsum += numbers[k];

                }
                System.out.println(Currsum);
                if(maxsum<Currsum){
                    maxsum=Currsum;
                }
            }
        }
        System.out.println("Max sum ="+ maxsum);

    }

    

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        max_subaarays(numbers);
        
    }
}