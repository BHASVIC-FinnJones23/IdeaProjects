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
        String inputPassword = scanner.nextLine();

        if (inputUser.equals("alex") && inputPassword.equals("sunshine")){
            System.out.println("LOGEDIN ALEX");
        }else if (inputUser.equals("emma") && inputPassword.equals("haskell")){
            System.out.println("loggedin ema");
        }else{
            System.out.println("lol wrong idiot");
        }

        //line by line
        String text = scanner.nextLine();
        String[] pieces = text.split(" ");
        for(int i = 0; i<pieces.length;i++){
            System.out.println(pieces[i]);
        }

    }
}