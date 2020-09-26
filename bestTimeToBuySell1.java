// best time to buy and sell stock - one transaction allowed

class bestTimeToBuySell1{

    public static void main(String[] args){
        int[] prices = {22,27,20,35,31,32,28,30,19,25};

        int lsf = Integer.MAX_VALUE;
        int cp = 0;
        int op = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<lsf){
                lsf = prices[i];
            }

            cp = prices[i] - lsf;
            if(cp > op){
                op = cp;
            }
        }
        
        System.out.println(op);
    }
}