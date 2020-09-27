// best time to buy and sell stock with transaction fee - infinite transactions allowed

class bestTimeToBuySell3{

    public static void main(String[] args){
        int[] prices = {10,15,17,20,16,18,22,20,22,20,23,25};
        int fee = 3;

        int obsp = -prices[0];
        int ossp = 0;

        for(int i=1; i<prices.length; i++){
            int nbsp = Math.max(obsp, ossp - prices[i]);
            int nssp = Math.max(ossp, obsp + prices[i] - fee);

            obsp = nbsp;
            ossp = nssp;
        }

        System.out.println(ossp);
    }
}