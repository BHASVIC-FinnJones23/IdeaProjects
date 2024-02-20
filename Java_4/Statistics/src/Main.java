import java.io.InputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        Statistics statistics = new Statistics();
        /*
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

         */
        Scanner scanner = new Scanner(System.in);

        /*

        //Next bit for sum of user input 1
        System.out.println("Enter Numbers (-1 to end):");
        int currentInput = 0;
        while(true){
            currentInput = Integer.parseInt(scanner.nextLine());
            if(currentInput==-1){
                break;
            }else{
                statistics.addNumber(currentInput);
            }
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

         */

        Statistics statisticsOdd = new Statistics();
        Statistics statisticsEven = new Statistics();
        int lastValue = 0;

        while(true){
            lastValue = Integer.parseInt(scanner.nextLine());
            if(lastValue==-1){
                break;
            }
            statistics.addNumber(lastValue);
            if(lastValue%2!=0){
                //odd
                statisticsOdd.addNumber(lastValue);
            }else{
                //even
                statisticsEven.addNumber(lastValue);
            }
        }
        System.out.println("🔥: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

    }
}