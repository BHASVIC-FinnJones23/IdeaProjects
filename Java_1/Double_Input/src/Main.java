import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number in floating point");
        double number = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote the number that is the value of "+number);
    }
}