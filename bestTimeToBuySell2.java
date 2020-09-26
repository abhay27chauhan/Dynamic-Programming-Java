// best time to buy and sell stock - infinite transactions allowed

class bestTimeToBuySell2{

    public static void main(String[] args){
        int[] prices = {22,27,20,35,31,32,28,30,19,25};

        int bd = 0;
        int sd = 0;

        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] >= prices[i-1]){
                sd++;
            }else{
                profit += prices[sd] - prices[bd];
                bd = sd = i;
            }
        }
        profit += prices[sd] - prices[bd];
        System.out.println(profit);
    }
}