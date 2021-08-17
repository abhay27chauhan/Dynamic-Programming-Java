import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] coins = new int[n];
        for(int i=0; i<coins.length; i++){
            coins[i] = scn.nextInt();
        }
        
        int amt = scn.nextInt();
        
        int[][] dp = new int[n][amt+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        //System.out.println(combinations(coins, amt, 0));
        //System.out.println(combinations2(coins, amt, 0));
        System.out.println(combinations3(coins, amt, 0, dp));
    }
    
    public static int combinations(int[] coins, int amt, int idx){
        if(amt < 0){
            return 0;
        }
        
        if(amt == 0){
            return 1;
        }
        
        int ans = 0;
        for(int i=idx; i<coins.length; i++){
            int f1 = combinations(coins, amt - coins[i], i);
        
            ans += f1;   
        }
        
        return ans;
        
    }
    
    public static int combinations2(int[] coins, int amt, int idx){
        if(amt == 0){
            return 1;
        }
       
        if(idx == coins.length){
            if(amt == 0){
                return 1;
            }else{
                return 0;
            }    
        }
        
        
        int noi = amt/coins[idx];
        int f1 = combinations2(coins, amt, idx+1);
        int f2 = 0;
        for(int i=1; i<=noi; i++){
            f2 = combinations2(coins, amt - (coins[idx]*i), idx+1);
        }

        int ans = f1 + f2;
        return ans;
        
    }
    
    public static int combinations3(int[] coins, int amt, int idx, int[][] dp){
        if(amt < 0){
            return 0;
        }
        
        if(amt == 0){
            return 1;
        }
       
        if(idx == coins.length){
            if(amt == 0){
                return 1;
            }else{
                return 0;
            }    
        }
        if(dp[idx][amt] != -1){
            return dp[idx][amt];
        }
        
        int f1 = combinations3(coins, amt, idx+1, dp); // no ki call, idx+1
        int f2 = combinations3(coins, amt - coins[idx], idx, dp); // yes ki call, idx

        int ans = f1 + f2;
        dp[idx][amt] = ans;
        return ans;
        
    }
}
