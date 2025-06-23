package Array.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class AllTwoSum {

    public static int[] OptimalSol(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }

        return new int[0];
    }

    public static int[] BetterSol(int[] arr , int target){

        HashMap <Integer , Integer > map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];

            if(map.containsKey(more)){
               return new int[]{map.get(more),i};
            }

            map.put(arr[i] ,i);
        }

        return new int[0];

    }

    public static int[] BruteSol(int[] arr , int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];

    }

    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target = 14;

        System.out.println(Arrays.toString(BruteSol(arr, target)) );
        System.out.println(Arrays.toString(BetterSol(arr, target)) );
        System.out.println(Arrays.toString(OptimalSol(arr, target)) );


    }
}
