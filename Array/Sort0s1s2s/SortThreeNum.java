package Array.Sort0s1s2s;

import java.util.Arrays;

public class SortThreeNum {

    public static void swap(int index1 , int index2 , int[]arr){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    public static void Sort(int[] arr){

        int low =0;
        int mid =0;
        int high = arr.length-1;

      while(mid<=high){
          if(arr[mid]==0){

              swap(low,mid , arr);
              low++;
              mid++;

          }else if(arr[mid]==1){

              mid++;

          }else{
              swap(mid , high , arr);
              high--;
          }
      }


    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,2,1,2,0,0,0};

        Sort(arr);
        System.out.println(Arrays.toString(arr));


    }

}
