// give no. of ways
import java.util.Scanner;
class climbStairs{

    public static int climbStairs(int n, int[] qb){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }

        if(qb[n] != 0){
            return qb[n];
        }

        int nm1 = climbStairs(n-1, qb);
        int nm2 = climbStairs(n-2, qb);
        int nm3 = climbStairs(n-3, qb);

        int cp = nm1 + nm2 + nm3;

        qb[n] = cp;

        return cp;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = climbStairs(n, new int[n+1]);
        System.out.println(res);
    }
}