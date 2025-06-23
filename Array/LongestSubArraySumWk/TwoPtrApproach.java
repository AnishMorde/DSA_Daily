package Array.LongestSubArraySumWk;
//best for the positive and zero include in the array
public class TwoPtrApproach {

    public static int maxLen(int[] arr , int k){
       int sum = 0;
       int right = 0;
       int left =0;
       int max =0;


       while(right<arr.length){
           sum+=arr[right];
           while(left<=right && sum>k){
               sum-=arr[left];
               left++;
           }

           if(sum==k){
               max = Math.max(max , right-left+1);
           }

           right++;
       }


       return max;


    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,1,1,3,3};
       int k = 6;

        System.out.println( maxLen(arr,k));


    }
}
