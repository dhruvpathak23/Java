package Recursion.subset;
//create all the subsets of "abc".
public class subseq {
   public static void main (String [] args){
    
    Subseq(" ","abc");
   } 
   static void Subseq(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    //to be
    Subseq(p+ch, up.substring(1));
    //not to be
    Subseq(p, up.substring(1));
   }
}
