class paintHouse{

    public static void main(String[] args){
        int[][] arr = {{1,5,7},{5,8,4},{3,2,9},{1,2,4}};

        int[][] dp = new int[arr.length][3];
        int n = dp.length;

        for(int i=0; i<arr[0].length; i++){
            dp[0][i] = arr[0][i];
        }

        for(int i=1; i<dp.length; i++){
            dp[i][0] = arr[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = arr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = arr[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }

        int minCost = Math.min(dp[n-1][0], Math.min(dp[n-1][1],dp[n-1][2]));
        System.out.println(minCost);
    }
}