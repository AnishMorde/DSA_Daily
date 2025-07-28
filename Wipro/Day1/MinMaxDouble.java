package Wipro.Day1;

import java.util.Scanner;

public class MinMaxDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =5;
        Double[] arr = new Double[n];


        System.out.println("Enter " + n + " double values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }


        Double min = arr[0];
        Double max = arr[0];


        for (int i = 1; i < n; i++) {
            if (Double.compare(arr[i], max) > 0) {
                max = arr[i];
            }
            if (Double.compare(arr[i], min) < 0) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

    }
}
