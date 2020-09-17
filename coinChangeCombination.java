class coinChangeCombination{

    public static void main(String[] args){
        int[] coins = {2,3,5};
        int amt = 7;

        int[] dp = new int[amt+1];

        dp[0] = 1;

        for(int i=0; i<coins.length; i++){
            for(int j=coins[i]; j<dp.length; j++){
                int val = j-coins[i];
                dp[j] += dp[val];
            }
        }

        System.out.println(dp[amt]);
    }
}