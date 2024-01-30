import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Pick a number!");
        printUntilNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("Pick a number!");
        printFromNumberToOne(Integer.parseInt(scanner.nextLine()));
    }
    public static void printUntilNumber(int number){
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }
    public static void printFromNumberToOne(int number){
        for(int i = number;i>0;i--){
            System.out.println(i);
        }
    }
}