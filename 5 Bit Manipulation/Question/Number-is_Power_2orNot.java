// Q -> check if a number is power of 2 or not
public class Number_is_Power_2orNot {
    public static int isPoweroftwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPoweroftwo(8));
    }
}
