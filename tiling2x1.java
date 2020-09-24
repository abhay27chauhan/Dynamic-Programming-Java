class tiling2x1{

    public static void main(String[] args){
        int n = 6; // this makes 2x6 size floor on which tiles will be mounted

        int[] dp = new int[n+1];
        dp[1] = 1; // for 2x1 no. of ways of tiling is 1
        dp[2] = 2; // for 2x2 no. of ways of tiling is 2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}