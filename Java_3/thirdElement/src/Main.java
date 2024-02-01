// import the list so the program can use it
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* ====THIS IS THIRD ELEMENT====
        // create a list
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<3;i++){
            System.out.println("nxt in:");
            String item = scanner.nextLine();
            list.add(item);
        }
        System.out.println(list.get(2));
        // the list isn't used yet

         */
        /*
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<5;i++){
            System.out.println("nxt in:");
            int item = Integer.parseInt(scanner.nextLine());
            list.add(item);
        }
        System.out.println((list.get(1)+ list.get(2)));

         */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<5;i++){
            System.out.println("nxt in:");
            int item = Integer.parseInt(scanner.nextLine());
            list.add(item);
        }
        int smallest = 999999999;
        int index = 0;
        for(int i = 0; i<5;i++){
            if(list.get(i)<smallest){
                index = i;
                smallest=list.get(i);
            }
        }
        System.out.println("Index of smallest value is "+index+", which means it is in the #"+(index+1)+" position");
    }
}