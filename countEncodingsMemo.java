public static int ce(String str, int idx, int[] dp){
        if(idx == str.length()){
            return 1;
        }
        
        if(str.charAt(idx) == '0'){
            return 0;
        }
        
        if(dp[idx] != -1){
            return dp[idx];
        }
        int f1 = ce(str, idx+1, dp);
        int f2 = 0;
        
        if(idx + 2 <= str.length()){
            if(Integer.parseInt(str.substring(idx, idx+2)) <= 26){
                f2 = ce(str, idx+2, dp);
            }
        }
        
        int ans = f1 + f2;
        dp[idx] = ans;
        return ans;
        
    }
