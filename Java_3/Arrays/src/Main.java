import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Swap
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;
        for(int i=0; i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Pick first value to be swapped");
        int index1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Pick seocnd value to be swapped");
        int index2 = Integer.parseInt(scanner.nextLine());
        int helper = numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=helper;
        for(int i=0; i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Gimme integer to search fore");
        int search = Integer.parseInt(scanner.nextLine());
        int foundIndex = -1;
        for(int i = 0; i<5; i++) {
            if (numbers[i] == search) {
                foundIndex = i;
            }
        }
        if(foundIndex>=0){
            System.out.println(search+" FOUND at index "+foundIndex);
        }else{
            System.out.println("did not find your value lol, which was "+search);
        }
    }
}