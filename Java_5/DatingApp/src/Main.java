public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(26,10,100);

        System.out.println(date);
        System.out.println(date.afterNumberOfDays(365));
        System.out.println(date);
    }
}