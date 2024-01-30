import java.util.Scanner;
public class Main {
    public static String grade = new String("");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giv score [0-100]");
        int score = Integer.parseInt(scanner.nextLine());

        if(score<0){
           grade = "Impossible";
        }else if(score<50){
            grade = "Failed!";
        }else if(score<60){
            grade = "1";
        }else if(score<70){
            grade = "2";
        }else if(score<80){
            grade = "3";
        }else if(score<90){
            grade = "4";
        }else if(score <=100){
            grade = "5";
        }else{
            grade = "Incerdible!";
        }
        System.out.println("Grade is: "+grade);
    }
}