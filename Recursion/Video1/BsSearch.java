package Recursion.Video1;

public class BsSearch {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10};

        System.out.println( recFun(arr , 10 , 0 , 9 ));

    }

    public static int recFun(int arr[] ,int target , int start , int end){
        int mid = start + (end-start)/2;
        if(start>end){
            return -1;
        }

        if(arr[mid] == target){
          return mid;
        } else if(arr[mid] > target){
            return recFun(arr , target , start , mid-1);
        }

        return recFun(arr , target , mid+1 , end);
    }
}
