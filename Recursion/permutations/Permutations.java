package Recursion.permutations;
import java.util.ArrayList;
//P.S. : generate all permutations of a string

// at every recursive level, there is variable no. of recursive calls.
// the no. of recurcise calls depend on the length of the processed string 'p'.
// No. of recursive calls = length of 'p' + 1.
// at every call we are making another call i.e., 
// adding the first character of 'up' in the potential positions of 'p' in their respective positions.
public class Permutations {
    public static void main (String [] args){
        ArrayList <String> result = permutationsList("", "abc");
        System.out.println(result);
    }
    static ArrayList <String> permutationsList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationsList(first + ch + second, up.substring(1)));
        }
        return ans;
    }
    
}
