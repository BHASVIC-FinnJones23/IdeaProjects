import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Sum of two numbers = "+(first+second));

        int dividend = 3;
        int divisor = 2;

        double result = dividend / divisor * 1.0;
        System.out.println(result);
    }
}