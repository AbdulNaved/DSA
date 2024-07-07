public class setbits_ANumber {

    public static int CounrtSetBits (int n){
        int Count = 0;
        while (n>0) {
            if((n&1)!=0){ //chack our lsb
                Count++;
            }
        }
        n=n>>1;
        return Count;

    }
    public static void main(String[] args) {
        System.out.println(CounrtSetBits(15));
    }
}