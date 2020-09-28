// best time to buy and sell stock - cool down period (infinite transaction);

class bestTimeToBuySell4{

    public static void main(String[] args){
        int[] prices = {10,15,17,20,16,18,22,20,22,20,23,25};

        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0; // after every sell - cool down peroid of 1 day;

        for(int i=1; i<prices.length; i++){
            int nbsp = Math.max(obsp, ocsp - prices[i]);
            int nssp = Math.max(ossp, obsp + prices[i]);
            int ncsp = Math.max(ocsp, ossp);

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }

        System.out.println(ossp);
    } 
}