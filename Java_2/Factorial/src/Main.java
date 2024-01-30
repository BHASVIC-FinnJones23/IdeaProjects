import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello PICK NUMBER NOW!");
        int int1 = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for(int i=int1;i>0;i--){
            result = result*i;
        }
        System.out.println(result);
    }
}