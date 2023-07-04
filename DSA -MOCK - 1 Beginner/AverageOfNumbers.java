import java.util.Scanner;
public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number;
        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            sum += number;
            count++;
        } while (number != 0);
        double average = (double) sum / count;
        System.out.println("The average is " + average);
        sc.close();
    }
}
