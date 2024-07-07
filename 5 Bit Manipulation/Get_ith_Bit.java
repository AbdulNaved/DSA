public class Get_ith_Bit {

    public static int getIthBIT(int n, int i){
        int bitMask = 1<<i;
       if((n & bitMask) == 0) {
         return 0;
        }else{
         return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBIT(10, 2));
    }

}
    
    
    
