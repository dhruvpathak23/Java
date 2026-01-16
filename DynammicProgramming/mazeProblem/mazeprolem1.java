package DynammicProgramming.mazeProblem;

public class mazeprolem1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(mazeprolem("", n, m));
    }

    static int mazeprolem(String p, int n, int m) {
        if (n == 1 && m == 1) {
            System.out.println(p);
            return 1;
        }

        int count = 0;

        if (n > 1) {
            count += mazeprolem(p + 'D', n - 1, m);
        }
        if (m > 1) {
            count += mazeprolem(p + 'R', n, m - 1);
        }

        return count;
    }
}
