package Array.LongestSubArraySumWk;

/*
best for the negatives and positives
Longest Subarray with Sum K
Difficulty: MediumAccuracy: 24.64%Submissions: 622K+Points: 4
Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

Examples:

Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
Output: 6
Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
 */
import java.util.HashMap;

public class LongestSubArrayWk {

    public static int LengthOfLongArray(int[] arr , int k ){
        int curSum =0;
        int max = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){

            curSum+=arr[i];

            if(map.containsKey(curSum-k)){
                int index = map.get(curSum-k);
                if(max<i-index){
                    max = i-index;
                }

            }

            if(!map.containsKey(curSum)){
                map.put(curSum, i);
            }


        }

        return max;

    }
    public static void main(String[] args) {

        int [] arr = {2,0,0,3};
        int k=3;

        System.out.println(LengthOfLongArray(arr,k));


    }
}
