class unboundedKnapsack{

    public static void main(String[] args){
        int[] vals = {15,14,10,45,30};
        int[] wts = {2,5,1,3,4};
        int n = wts.length;
        int cap = 7;

        int[] dp = new int[cap+1];
        dp[0] = 0;
        int max = 0;
        for(int i=1; i<dp.length; i++){
            for(int j=0; j<n; j++){
                if(i>=wts[j]){
                    int cmax = dp[i-wts[j]] + vals[j];

                    if(cmax>max){
                        max = cmax;
                    }
                }
            }
            dp[i] = max;
        }

        System.out.println(dp[cap]);
    }
}