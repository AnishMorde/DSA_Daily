package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
       CircularQueue obj = new CircularQueue();

        for (int i = 0; i < 10; i++) {
            obj.insert(i*10);
        }

        obj.display();
        System.out.println(obj.front());
        System.out.println( obj.remove());

        obj.insert(455);
        obj.insert(77);

        obj.display();


    }
}
