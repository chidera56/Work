import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class PhotoClubMain {
    public static void main(String[] args) {
        Club club1 = new Club("PhotoClub");
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Photo Club Menu:");
            System.out.println("1. Sign up members for a seminar");
            System.out.println("2. Display members on a seminar");
            System.out.println("3. Add seminar to the club");
            System.out.println("4. Cancel seminar from the club");
            System.out.println("5. Search seminars by seminar code");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Task 1: Sign up members for a seminar
                    System.out.println("Enter seminar code: ");
                    String seminarCode = scanner.next();
                    Seminar seminar = club1.searchSeminarsBySeminarCode(seminarCode);

                    if (seminar != null) {
                        System.out.println("Enter member ID: ");
                        int memberId = scanner.nextInt();
                        Member member = new Member(memberId, "Member Name", "Adult"); // You may customize this
                        seminar.signUp(member);
                        System.out.println("Member signed up for the seminar.");
                    } else {
                        System.out.println("Seminar not found.");
                    }
                    break;

                case 2:
                    // Task 1: Display members on a seminar
                    System.out.println("Enter seminar code: ");
                    String code = scanner.next();
                    Seminar sem = club1.searchSeminarsBySeminarCode(code);

                    if (sem != null) {
                        sem.showMembersOnSeminar();
                    } else {
                        System.out.println("Seminar not found.");
                    }
                    break;

                case 3:
                    // Task 2: Add seminar to the club
                    System.out.println("Enter seminar code: ");
                    String newSeminarCode = scanner.next();
                    Seminar newSeminar = new Seminar(newSeminarCode, "New Seminar", 50.0, new Date()); // You may customize this
                    club1.addSeminar(newSeminar);
                    System.out.println("Seminar added to the club.");
                    break;

                case 4:
                    // Task 2: Cancel seminar from the club
                    System.out.println("Enter seminar code to cancel: ");
                    String cancelCode = scanner.next();
                    Seminar cancelSeminar = club1.searchSeminarsBySeminarCode(cancelCode);

                    if (cancelSeminar != null) {
                        club1.cancelSeminar(cancelSeminar);
                        System.out.println("Seminar canceled.");
                    } else {
                        System.out.println("Seminar not found.");
                    }
                    break;

                case 5:
                    // Task 2: Search seminars by seminar code
                    System.out.println("Enter seminar code to search: ");
                    String searchCode = scanner.next();
                    club1.searchSeminarsBySeminarCode(searchCode);
                    break;

                case 6:
                    System.out.println("Exiting Photo Club Program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

/*public class Main {
    public static void main(String[] args) {

        Member m1 = new Member(1, "John", "Adult");
        Member m2 = new Member(2, "Jane", "Child");
        Member m3 = new Member(3, "Bob", "Adult");
        Member m4 = new Member(4, "Alice", "Child");

        Club club1 = new Club("PhotoClub");
        Seminar s1 = new Seminar("S08_01", "Digital SLR", 35.0, new Date());

        try (Scanner sc = new Scanner(System.in)) {
            int option = 0;
            do {
                try {
                    System.out.println("1. Display all seminars.");
                    System.out.println("2. Show members signed up for a seminar.");
                    System.out.println("3. Add Seminar.");
                    System.out.println("4. Cancel Seminar.");
                    System.out.println("5. Search Seminar by Seminar code.");
                    System.out.println("6. Exit!");
                    option = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("INVALID!!!!!");
                }

                switch (option) {
                    case 1:

                        s1.signUp(m1);
                        s1.signUp(m2);
                        s1.signUp(m3);
                        s1.signUp(m4);
                        break;

                    case 2:
                        s1.showMembersOnSeminar();
                        break;

                    case 3:
                        Seminar s2 = new Seminar("S08_02", "Film Photography", 25.0, new Date(2023, 12, 10));
                        Seminar s3 = new Seminar("S08_03", "Darkroom Techniques", 30.0, new Date(2024, 01, 05));

                        club1.addSeminar(s2);
                        club1.addSeminar(s3);
                        break;

                    case 4:
                        club1.cancelSeminar(s1);
                        break;

                    case 5:
                        club1.searchSeminarsBySeminarCode("S08_02");
                        break;

                    case 6:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Be Safe!");

                }
            } while (option != 6);
        }
    }
}*/
