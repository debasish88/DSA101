public class BestTimeToBuySell {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length > 0){
            int low = prices[0];
        
            for(int i =0; i < prices.length; i++){
                low = Math.min(low, prices[i]);
                if((prices[i] - low) > maxProfit){
                    maxProfit = prices[i] - low;
                }
            }  
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuySell two = new BestTimeToBuySell();
        System.out.println(two.maxProfit(new int[] {7,1,5,3,6,4}));
    }
}
