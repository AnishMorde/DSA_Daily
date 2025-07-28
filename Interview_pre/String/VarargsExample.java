package Interview_pre.String;

public class VarargsExample {

    // Method to calculate average using varargs
    public static double calculateAverage(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Average 1: " + calculateAverage(10, 20, 30));
        System.out.println("Average 2: " + calculateAverage(5, 15));
        System.out.println("Average 3: " + calculateAverage());
    }
}

