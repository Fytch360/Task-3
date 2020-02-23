import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int year = scanner.nextInt();
        System.out.println("Enter current month number: ");
        int month = scanner.nextInt();
        System.out.println("Current date is:" + year + " " + monthVal(month) + " " + YearVisok(year));
    }

    public static String monthVal(int a) {
        if (a == 1) {
            return "Jan";
        } else if (a == 2) {
            return "Feb";
        } else if (a == 3) {
            return "Mar";
        } else if (a == 4) {
            return "Apr";
        } else if (a == 5) {
            return "May";
        } else if (a == 6) {
            return "Jun";
        } else if (a == 7) {
            return "Jul";
        } else if (a == 8) {
            return "Aug";
        } else if (a == 9) {
            return "Sep";
        } else if (a == 10) {
            return "Oct";
        } else if (a == 11) {
            return "Nov";
        } else if (a == 12) {
            return "Dec";
        }
        else {
            return "error";
        }
    }
    public static String YearVisok(int b){
        if ( b % 400 == 0 ||  b % 4 == 0 && b % 100 != 0) {
            return "visokosnii";
        }
        else {
            return "ne visokosnii";
        }
    }
}


