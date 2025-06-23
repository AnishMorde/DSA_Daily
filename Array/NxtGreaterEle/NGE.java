package Array.NxtGreaterEle;

import java.util.Arrays;

public class NGE {
    public static int[] fun (int [] arr){
        int nums[] = new int[arr.length];
        nums[arr.length-1]=-1;

        for (int i = 0; i < arr.length; i++) {
            nums[i]=-1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    nums[i]=arr[j];
                    break;
                }

            }

        }

        return  nums;


    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        //[5, 10, 10, -1, -1]

        System.out.println(Arrays.toString( fun(arr)));
    }
}
