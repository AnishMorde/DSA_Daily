package OOP.OBJ.constructor;

public class Car {

    String model;
    int speed;
    int price;

    Car(String model , int speed , int price){
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public static void main(String[] args) {

        //when you create the obj then the constructor called of that class
        //main puprose of the constructor is used to initailize the object
        //same name as the class
        /*

        They have the same name as the class.
        They do not have a return type (not even void).
        They are called implicitly (automatically) when an object is created using the new keyword.


         */
        Car obj = new Car("Safari" , 120 , 3500000);

        System.out.println(obj.price);
    }
}
