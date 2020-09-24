class tilingMx1{

    public static void main(String[] args){
        int n = 6;
        int m = 3;
        // above info signifies floor is of mxn (3x6) and tile is of mx1 (3x1)

        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++){
            if(m>i){
                dp[i] = 1;
            }else if(m == i){
                dp[i] = 2;
            }else{
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        System.out.println(dp[n]);
    }
}