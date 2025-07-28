package Stack.Qusetions;

import java.util.Stack;

public class BalacedBrackets {
   public static int  isBalanced(String str){

       int count =0;

       Stack<Character> stack = new Stack<>();

       for(char ch : str.toCharArray()){
           if(ch == '('){
               stack.push(ch);
           }else{
               if(!stack.isEmpty()){
                   stack.pop();
               }else{
                   count++;
               }

           }
       }

       return count;

    }
    public static void main(String[] args) {
        System.out.println( isBalanced("))))()()"));
    }
}
