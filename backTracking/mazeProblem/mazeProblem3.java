package backTracking.mazeProblem;
import java.util.*;

//print the actual apth by which we can go from point A to point B(0,0) -> (2,2) in a maze with diagonal moves allowed.
public class mazeProblem3{
    public static void main(String[] args){
        System.out.println(list("", 2, 2));
    }
    static ArrayList<String> list (String p, int r, int c){
        ArrayList <String> ans = new ArrayList<>();

        if(r ==0 && c == 0){
            ans.add(p);
            return ans;
        }
        if(r > 0){
            ans.addAll(list(p+"D",r-1,c));
        }
        if(c > 0){
            ans.addAll(list(p+"R",r,c-1));
        }
        if(r > 0 && c > 0){
            ans.addAll(list(p+"C",r-1,c-1));
        }
        return ans;
    }
}