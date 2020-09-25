// every one has 2 options - either they can be single or pair up with someone;
class friendsPairingProblem{

    public static void main(String[] args){
        int n = 5; // no. of friends
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2]*(i-1);
        }
        // dp[i-1] -> 1 single and no. of ways other can be paired
        // dp[i-2]*(i-1) -> any 2 make a pair (that's why -> *(i-1)) and no. of ways others can be paired
        
        System.out.println(dp[n]);
    }
}