/*tabulation 
    1. storage and meaning
    2.direction (small problem to big problem)
    3. Travel and solve
*/

import java.util.Scanner;
class climbStairsTab{

    public static int climbStairsTab(int n){
        int[] dp = new int[n+1];

        dp[0] =1;
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i] += dp[i-1];
            }else if(i==2){
                dp[i] += dp[i-1] + dp[i-2];
            }else{
                dp[i] += dp[i-1] + dp[i-2] + dp[i-3];
            }
            
        }

        return dp[n] ;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = climbStairsTab(n);
        System.out.println(res);
    }
}