package Basics.basics1;


//Java Methods are blocks of code that perform a specific task. A method allows us to reuse code, improving both efficiency and organization. All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects.
public class Methods {

    public  void fun(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        Methods obj1 = new Methods();
        obj1.fun();

        System.out.println(Math.random());
    }
}
