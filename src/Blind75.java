import java.util.Arrays;
import java.lang.Math;

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


    //Is paladrome checks if an int is a paladrome
    //Did this using pointers I guess
    public static boolean isPalindrome(int x) {
        String reversed = String.valueOf(x);
        int pointer = reversed.length()-1;
        for (int i = 0; i < reversed.length()/2; i++) {
            if(reversed.charAt(i) != reversed.charAt(pointer)){
                return false;
            }
            pointer--;
        }
        return true;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m, j = 0; j < nums2.length; j++,i++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));


    }



    public static int kthFactor(int n, int k) {
        //n is the number that we are trying to find factors of
        //k is the factor that we need to find

        int count = 0;
        int factor = 0;

        for (int i = 1; i <= (n/2)+1; i++) {
            if(n%i == 0){
                factor = i;
                count++;
            }
            if(count == k){
                return factor;
            }
        }
        factor = n;
        count++;
        if (count == k){
            return factor;
        }
        return -1;

    }

    public static int maxArea(int[] height) {
        int maxWater = 0;
        int right = height.length-1;
        int left = 0;


        while (right>left){
            if(height[left] >= height[right]){
                if (height[right] * (right - left) > maxWater) {
                    maxWater = height[right] * (right - left);
                }
                right--;
            }
            else {
                if (height[left] * (right - left) > maxWater) {
                    maxWater = height[left] * (right - left);
                }
                left++;
            }

        }


        /*
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= n; j++) {
                if (height[i] > height[j]){
                    if (height[j] * (j-i) > maxWater){
                        maxWater = height[j] * (j-i);
                    }
                }
                else{
                    if (height[i] * (j-i) > maxWater){
                        maxWater = height[i] * (j-i);
                    }
                }
            }
        }*/

        return maxWater;

    }



    public int mySqrt(int x) {
        return (int) Math.floor(Math.sqrt(x));
    }







    public static void main(String[] args) {
        int[] nums = new int[] {9};

        System.out.println();


        //System.out.println(containsDuplicate(price));
    }
}