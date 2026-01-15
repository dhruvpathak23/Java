package Recursion.basicString;
//remove all the "apple" words from the string
public class wordRemoval {
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        } if (up.startsWith("apple")){
            return skip(up.substring(5));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
    public static void main(String[] args){
        String str = "bapplecdappleefapplegh";
        String result = skip(str);
        System.out.println("The final processed string is: " + result);
        
    }
}
