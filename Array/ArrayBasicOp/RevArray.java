package Array.ArrayBasicOp;

import java.util.Arrays;

public class RevArray {

    public void Reverse(int [] arr){

        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }



    }
    public static void main(String[] args) {
        RevArray obj = new RevArray();
        int [] arr = {1,2,3,4,5,6,7};

        obj.Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
