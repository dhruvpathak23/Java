package Recursion.level_01;

public class stringPalindrome {
    public static boolean isPalindrome (String str){
        return str.equals(reverse(str));
    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String []args){
        System.out.println(isPalindrome("pot"));
        System.out.println(isPalindrome("potop"));
    }
}
