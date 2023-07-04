public class LargestOfThree {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // Check if a is greater than b and c
        if (a > b && a > c) {
            System.out.println("The largest number is " + a);
        }
        // Check if b is greater than a and c
        else if (b > a && b > c) {
            System.out.println("The largest number is " + b);
        }
        // Otherwise, c is the largest number
        else {
            System.out.println("The largest number is " + c);
        }
    }
}
