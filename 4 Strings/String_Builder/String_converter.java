// for given  string convert each the first letter of each word to uppercase --> "hi , i am naved"

public class String_converter {
    public static String Touppercase(String str){
        char ch = Character.toUpperCase((str.charAt(0)));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == && i<str.length() i++){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase((str.charAt(i))));
            }else{
                sb.append(str.charAt(i));
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        String str = "hi, i am naved";
        System.out.println(Touppercase(str));
    }
}