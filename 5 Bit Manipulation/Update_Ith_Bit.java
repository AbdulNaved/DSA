public class Update_Ith_Bit {
    public static int UpdateIthBit(int n, int i){
        //n = ClearIthBit(n,i);
        int bitMask = newBit << i;
        return n | bitMask;

    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
}
