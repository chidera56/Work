import java.util.Scanner;

public class Main {
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
}
