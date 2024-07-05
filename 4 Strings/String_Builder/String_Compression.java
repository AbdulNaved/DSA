public class String_Compression {
    public static String Compress(String str) {
        String newstr = "";

        for(int i=0; i<str.length(); i++){
            Integer Count = 1;
            while (i<str.length()-1 && str.charAt(i)) == str.charAt(i+1) {
                count ++;
                i++;
            }
            newstr += str.charAt(i);
            if( count > 1) {
                newstr += Count.to.String();
            }

        } 
        return newstr;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccccddd";
        System.out.println(str);
    }
}
