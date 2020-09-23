class paintHouse2M2{

    public static void main(String[] args){
        int[][] arr ={{1,5,7,2,3,4},{5,8,4,3,6,1},{3,2,9,7,2,3},{1,2,4,9,1,7}};
        int n = arr.length;

        int[][] dp = new int[arr.length][arr[0].length];

        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;
        for(int j=0; j<arr[0].length; j++){
            dp[0][j] = arr[0][j];

            if(dp[0][j]<least){
                sleast = least;
                least = dp[0][j];
            }else if(dp[0][j] < sleast){
                sleast = dp[0][j];
            }
        }

        for(int i=1; i<dp.length; i++){
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            for(int j=0; j<dp[0].length; j++){
                if(dp[i][j] == least){
                    dp[i][j] = arr[i][j] + sleast;
                }else{
                    dp[i][j] = arr[i][j] + least;
                }

                if(dp[i][j]<nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }else if(dp[i][j] < nsleast){
                    nsleast = dp[i][j];
                }
            }

            least = nleast;
            sleast = nsleast;
        }

        System.out.println(least);
    }
}