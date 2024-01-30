import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick first number:");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Pick second number:");
        int secondNum = Integer.parseInt(scanner.nextLine());
        int number = firstNum+secondNum;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);
    }
}