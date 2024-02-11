public class Pairsanarray {
    public static void printpairs(int numbers[]){
        int Tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            //2 4 6 8 10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                Tp++;
            }
            System.out.println();

        } 
        System.out.println("total pairs = " + Tp);
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printpairs(numbers);
        
    }
}
