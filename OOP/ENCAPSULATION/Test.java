package OOP.ENCAPSULATION;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
//        car.color = "blue";
//        car.model = "safari";
//        car.year = 2020;
//        car.speed = 50;

        car.setColor("blue");
        car.setSpeed(100);
        car.accelerate(10);

        System.out.println(car.getSpeed());
    }
}
