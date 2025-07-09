package Stack.Inbuilt;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        Stack<Integer> stack = new Stack<>();

//        stack.push(10);
//        stack.push(12);
//        stack.push(14);
//        stack.push(16);
//        stack.push(18);
//
//        for (int i=0;i<5;i++){
//            System.out.println(stack.pop());
//        }

//        Queue <Integer> queue = new LinkedList<>();
//
//        for (int i = 0; i < 5 ; i++) {
//            queue.add(i);
//        }
//
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());


//        Deque<Integer> deque = new ArrayDeque<>();


  DynamicStack obj = new DynamicStack(5);

        for (int i = 0; i < 50; i++) {
            obj.push(i*10);
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(obj.pop());
        }




    }
}
