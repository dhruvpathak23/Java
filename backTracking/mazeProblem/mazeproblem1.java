package mazeProblem;
// print the no. of ways by which we can go frp point A to point B(0,0) -> (2,2) in a maze.
public class mazeproblem1 {
    public static void main(String[]args){
        System.out.println(count(2,2));
    }
    static int count(int r , int c){
        if(r == 0 || c == 0){
            return 1;
        } 
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }
}

