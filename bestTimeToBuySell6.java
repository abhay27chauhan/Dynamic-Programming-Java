// best time to buy and sell stock - k transactions allowed

class bestTimeToBuySell6{

    public static void main(String[] args){
        int[] prices = {9,6,7,6,3,8};
        int k = 3;

        int[][] dp = new int[k+1][prices.length];

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int max = dp[i][j-1];

                for(int pd = 0; pd<j; pd++){
                    int ptilltm1 = dp[i-1][pd];
                    int pth = prices[j]-prices[pd];

                    if(ptilltm1 + pth > max){
                        max = ptilltm1 + pth;
                    }
                }
                dp[i][j] = max;
            }
        }

        System.out.println(dp[k][prices.length-1]);
    }
}