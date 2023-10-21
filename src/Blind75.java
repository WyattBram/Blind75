public class Blind75 {


    public static int maxProfit(int[] prices) {
        int profit = 0;


        for (int i = 0; i < prices.length-1; i++) {
            int indexJ = i+1;
            while(indexJ <= prices.length-1){
                if(prices[indexJ] - prices[i] > profit){
                    profit = prices[indexJ] - prices[i];
                }
                indexJ++;
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] price = new int[] {7,6,3,3,7,15,6,3,53,6,23,5,77,85,5,7};

        System.out.println(maxProfit(price));
    }
}