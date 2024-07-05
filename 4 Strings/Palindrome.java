// check id a string is pailndrome given => noon , madam , is pailndrome and racrcar

public class Palindrome {

    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++){

            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not  a pailandrome 
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
