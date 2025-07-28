package Stack.Qusetions;

import java.util.Arrays;
import java.util.Stack;

//pop ans push
public class NextGreater {
    public static int[] fun(int [] arr){
        int n = arr.length;
        int [] result=  new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[n-1]);
        result[n-1] = -1;
        for(int i = n-2 ;i>=0;i--){
            while(stack.size() > 0 && stack.peek() < arr[i]  ){
                stack.pop();
            }

            if(stack.size() == 0) {
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }

            stack.push(arr[i]);

        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 1,5,3,2,1,6,3,4};

        System.out.println(Arrays.toString(fun(arr)));

    }
}
