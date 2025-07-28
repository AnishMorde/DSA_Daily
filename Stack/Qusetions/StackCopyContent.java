package Stack.Qusetions;

import java.util.Stack;

public class StackCopyContent {
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<>();
        for (int i=0;i<5;i++){
            stack.push(i*10);
        }
        Stack<Integer> copy  = new Stack<>();
        copyStack(stack , copy);

        System.out.println(copy);
    }

    private static Stack<Integer> copyStack(Stack<Integer> stack, Stack<Integer> copy) {
        if(stack.isEmpty()){
            return copy;
        }

        int popped = stack.pop();
        copyStack(stack , copy);
        copy.push(popped);
        return copy;
    }
}
