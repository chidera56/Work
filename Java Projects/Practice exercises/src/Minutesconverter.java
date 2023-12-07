import java.util.Scanner;

public class Minutesconverter {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter any number of minutes: ");
        double minutes = userinput.nextDouble();
        userinput.close();

        double MinutesInYears = 60*24*365;
        double MinutesInDays = (minutes/60/24)%365;

        long years = (long) (minutes/MinutesInYears);
        int days = (int) (MinutesInDays);


        System.out.println("The number of minutes you entered is equal to"+" " +years+ " "+ "years"+" "+ "and"+" " +days+" "+ "days.");
    }
}
