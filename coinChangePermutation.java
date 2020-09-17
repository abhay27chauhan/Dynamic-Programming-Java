class coinChangePermutation{

    public static void main(String[] args){
        int[] coins = {2,3,5,6};
        int amt = 10;

        int dp[] = new int[amt+1];
        dp[0] = 1;
        for(int i=1; i<dp.length; i++){
            for(int coin: coins){
                if(i>=coin){
                    dp[i] += dp[i-coin];
                }
            }
        }
        System.out.println(dp[amt]);
    }
}