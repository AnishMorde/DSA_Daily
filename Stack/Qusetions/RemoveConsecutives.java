package Stack.Qusetions;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsecutives {

    public static int[] removeSubsequences(int[] arr){
      Stack <Integer> stack = new Stack<>();
      int n = arr.length;
      for(int i=0;i<n;i++){
          if(stack.size()==0 || stack.peek() != arr[i]){
              stack.push(arr[i]);
          } else if(arr[i]==stack.peek()){
              if( i==n-1 || arr[i] != arr[i+1]){
                  stack.pop();
              }
          }


      }

      int result[] = new int[stack.size()];

      for(int i=stack.size()-1 ;i>=0;i--){
          result[i] = stack.pop();
      }

      return result;


    }



    public static void main(String[] args) {
        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        System.out.println(Arrays.toString(removeSubsequences(arr)));
    }
}
