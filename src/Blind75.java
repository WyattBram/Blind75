import java.util.Arrays;

public class Blind75 {

    ////ARRAYS
    //Best time to buy and sell stock
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

    //Contains Duplicate
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            System.out.println(nums[i] +  " " + nums[i+1] + " "+i);
            if(nums[i] == nums[i+1]){

                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        int[] price = new int[] {1,2,3,4};
        System.out.println(containsDuplicate(price));


        //System.out.println(containsDuplicate(price));
    }
}