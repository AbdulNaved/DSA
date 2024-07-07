public class Set_Ith_Bit {
    public static int SetITHBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(SetITHBit(10, 2));
    }
}
