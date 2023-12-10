
// Club.java
import java.util.HashMap;

public class Club {
    public String name;
    public HashMap<String, Seminar> seminars;

    public Club(String name) {
        this.name = name;
        this.seminars = new HashMap<>();
    }

    public void addSeminar(Seminar seminar) {
        seminars.put(seminar.seminarCode, seminar);
    }

    public void cancelSeminar(Seminar seminar) {
        seminars.remove(seminar.seminarCode);
    }

    public void searchSeminarsBySeminarCode(String seminarCode) {
        Seminar seminar = seminars.get(seminarCode);
        if (seminar != null) {
            System.out.println(seminar.toString());
        } else {
            System.out.println("Seminar not found.");
        }
    }
}
