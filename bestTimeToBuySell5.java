// best time to buy and sell - 2 transactions allowed

class bestTimeToBuySell5{

    public static void main(String[] args){
        int[] prices = {10,15,17,20,16,18,22,20,22,20,23,25};

        int mpisut = 0;
        int lsf = prices[0];
        int[] dpl = new int[prices.length];

        for(int i=1; i<prices.length; i++){
            if(prices[i]< lsf){
                lsf = prices[i];
            }

            mpisut = prices[i]-lsf;
            if(mpisut > dpl[i-1]){
                dpl[i] = mpisut;
            }else{
                dpl[i] = dpl[i-1];
            }
        }

        int mpibat = 0;
        int msf = prices[prices.length-1];
        int[] dpr = new int[prices.length];
       
        for(int i=prices.length-2; i>=0; i--){
            if(prices[i] > msf){
                msf = prices[i];
            }

            mpibat = msf - prices[i];

            if(mpibat > dpr[i+1]){
                dpr[i] = mpibat;
            }else{
                dpr[i] = dpr[i+1];
            }
        }

        int op = 0;
        for(int i=0; i<prices.length; i++){
            if(dpl[i]+dpr[i] > op){
                op = dpl[i] + dpr[i];
            }
        }

        System.out.println(op);
    }
}