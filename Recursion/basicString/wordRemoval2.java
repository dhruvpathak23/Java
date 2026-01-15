package Recursion.basicString;
// remove the word "app" if it's not starts "apple".
public class wordRemoval2 {
    static String skip (String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skip(up.substring(3));
        } else {
            return  up.charAt(0) + skip(up.substring(1));
        }
    }
    public static void main(String[]args){
        String str = "bappcdappleefappghapp";
        String result = skip(str);
        System.out.println("The final processed string is: " + result);
    }

    
}
