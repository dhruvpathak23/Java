package Recursion.level_01;

public class reverseString {
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String []args){
        System.out.println(reverse("Mass"));
    }
}
