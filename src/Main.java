import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.print("Enter a date (yyyy mm dd): ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        String monthName = NameMonth(month);
        System.out.println("You entered: " + year + "-" + monthName + "-" + day);
        scanner.close();
    }
    static boolean isValidDate(int year, int month, int day) {
        // Basic validation for demonstration purposes
        return (year >= 1000 && year <= 9999) &&
                (month >= 1 && month <= 12) &&
                (day >= 1 && day <= 31);
    }
    static String NameMonth(int monthNumber) {
        // Using the Month enum to get the month name
        return java.time.Month.of(monthNumber).name();
    }

}