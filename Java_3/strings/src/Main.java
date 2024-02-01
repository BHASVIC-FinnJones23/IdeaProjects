import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //print Thrice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word:");
        String word = scanner.nextLine();
        System.out.println(word+word+word);

        //Is it true
        System.out.println("Give a string:");
        word = scanner.nextLine();
        if(word.equals("True")){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }

        //Login
        String User1 = "alex";
        String Pass1 = "sunshine";
        String User2 = "emma";
        String Pass2 = "haskell";

        System.out.println("Enter Username:");
        String inputUser = scanner.nextLine();
        System.out.println("Enter Password");
        String inpu


    }
}