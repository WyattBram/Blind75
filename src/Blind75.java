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
        if(nums2.length == 0){
            return;
        }
        int[] temp = new int[nums1.length];



        for (int i = 0; i < nums1.length; i++) {
            if(n == -1){
                temp[i] = nums2[];
                n2++;
            }
            if(nums1[n1] < nums2[n2]){
                temp[i] = nums1[n1];
                n1++;
            }
            if(nums1[n1] == nums2[n2]){
                temp[i] = nums1[n1];
                n1++;
            }
            else{
                temp[i] = nums2[n2];
                n2++;
            }
        }
        nums1 = temp;
        System.out.println(Arrays.toString(nums1));

    }





    public static void main(String[] args) {
        int[] list = new int[] {1,2,3,0,0,0};
        int[] list1 = new int[] {2,5,6};

        merge(list, 3,list1,3);


        //System.out.println(containsDuplicate(price));
    }
}