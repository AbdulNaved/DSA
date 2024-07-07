public class Fast_Exponentiation {
    public static int boolean FastExpo(int a, int n){
        int ans = 1;

        while (n>0) {
            if (n&0 !=0) {
                ans = ans * a;
            }
            a = a*a ;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExpo(3, 5));
    }
}
