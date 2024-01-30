import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats ur name");
        String message = scanner.nextLine();
        System.out.println("Hello "+message+"!");
    }
}