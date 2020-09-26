class partitionIntoSubsets{

    public static void main(String[] args){
        int n = 4;
        int k = 3;

        if(n==0||k==0||n<k){
            System.out.println(0);
            return;
        }

        int[][] dp = new int[k+1][n+1];

        for(int i=1; i<=k; i++){
            for(int j=1; j<=n; j++){
                if(j<i){
                    dp[i][j] = 0;
                }else if(j==i){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + i*dp[i][j-1];
                }
            }
        }

        System.out.println(dp[k][n]);
    }
}