package Recursion.subset;

import java.util.ArrayList;

public class subsequencewithAscii {
    public static void main (String [] args){
        ArrayList<String> result = subseqAscii("","abc");
        System.out.println(result);

    }
    static ArrayList<String> subseqAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch = up.charAt(0);
        //to be
        ArrayList<String> first = subseqAscii(p+ch, up.substring(1));
        //not to be
        ArrayList<String> second = subseqAscii(p, up.substring(1));
        //ascii value
        ArrayList<String> third = subseqAscii(p + (ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
