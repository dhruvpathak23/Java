package Recursion.level_01;
public class reverseNumber {
    public static int reverse(int n, int rev){
        if (n == 0) return rev;
        else return reverse(n/10, rev*10 + n%10);
    }
    public static void main(String [] args){
        System.out.println(reverse(1243,0));
    }
}
