package ION_DSA.Array;

import java.util.Arrays;

public class AllFunQuestions {

    //How do you find the largest element in an array?
    public void findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max , arr[i]);
        }

        System.out.println("max num arr : " + max);
    }

    //Write a program to rotate an array by k positions.
    public void revrseByKPos(int arr[] , int k){
        int n = arr.length;
        k = k%n;

        reverseArr(arr , 0 , n-1);
        reverseArr(arr , 0 ,k-1);
        reverseArr(arr ,k , n-1);

        System.out.println("Reverse the array by k pos : " + Arrays.toString(arr));
    }


    //reverse the array
    public void reverseArr(int [] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }

    }

    //How do you find the missing number in an array of 1 to n?
    public void missingNum(int [] arr){
        int n = arr.length+1;
        int totalSum = (n * (n+1))/2;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        int ans = totalSum - sum;
        System.out.println("missing num arr : " + ans);
    }

    public void findSecLargeEle(int[] arr){
        int max = arr[0];
        int secMax = -1;
        for(int i=0;i<arr.length;i++){

            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }

        }

        System.out.println("Second largest element : " + secMax);
    }





























}
