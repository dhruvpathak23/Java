package Recursion.basicString;
//remove all the a's from the string

public class charRemoval {
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println("The processed string is"+p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch, up.substring(1));
        }
    }
    public static void main(String[]args){
        String str = "baccad";
        skip(" ", str);
       
    }
}

 
