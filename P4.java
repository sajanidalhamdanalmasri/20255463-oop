import java.util.Scanner;

public class LargestSmallestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0, sum = 0, count = 0;

        System.out.print("Enter a positive number (0 to stop): ");
        int x = input.nextInt();

        while (x != 0) {
            if (count == 0) {
                max = min = x;
            } else {
                if (x > max) max = x;
                if (x < min) min = x;
            }
            sum += x;
            count++;
            System.out.print("Enter a positive number (0 to stop): ");
            x = input.nextInt();
        }

        if (count > 0) {
            System.out.println("Largest = " + max);
            System.out.println("Smallest = " + min);
            System.out.println("Average = " + (double) sum / count);
        } else {
            System.out.println("No numbers were entered.");
        }
        input.close();
    }
}
