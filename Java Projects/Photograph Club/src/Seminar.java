/*import java.util.ArrayList;

abstract class Seminars {
    ArrayList<Member> MemberList = new ArrayList<Member>();
    Member member1 = new Member();
    Member member2 = new Member();
    Member member3 = new Member();
    Member member4 = new Member();
    Member member5 = new Member();

    int memberlistsize = MemberList.size();

    ArrayList<Seminar> SeminarList = new ArrayList<Seminar>();
    Seminar seminar1 = new Seminar();
    Seminar seminar2 = new Seminar();
    Seminar seminar3 = new Seminar();
    Seminar seminar4 = new Seminar();
    Seminar seminar5 = new Seminar();

    ArrayList<Member> signUpMember = new ArrayList<Member>();

    int totalFee = 30 * memberlistsize;
}

class Seminarss extends Seminars {

}

public class Seminar {
    String seminarCode;
    String seminarDescription;
    String seminarDate;
    Double seminarFee;

    public Seminar() {

    }

    public Seminar(String seminarCode, String seminarDescription, String seminarDate, Double seminarFee) {
        this.seminarCode = seminarCode;
        this.seminarDescription = seminarDescription;
        this.seminarDate = seminarDate;
        this.seminarFee = seminarFee;
    }

    public String toString() {
        return seminarCode + " " + seminarDescription + " " + seminarFee + " " + seminarDate;
    }
}*/

// Seminar.java
import java.util.ArrayList;

public class Seminar {
    public String seminarCode;
    public String description;
    public double entryFee;
    private Date date;
    public double totalFees;
    public ArrayList<Member> members;

    public Seminar(String seminarCode, String description, double entryFee, Date date) {
        this.seminarCode = seminarCode;
        this.description = description;
        this.entryFee = entryFee;
        this.date = date;
        this.totalFees = 0;
        this.members = new ArrayList<>();
    }

    public void signUp(Member member) {
        members.add(member);
        totalFees += entryFee;
    }

    public void showMembersOnSeminar() {
        for (Member member : members) {
            System.out.println(member.toString());
        }
    }

    public String getSeminarCode() {
        return seminarCode;
    }

    @Override
    public String toString() {
        return "Seminar Code: " + seminarCode + ", Description: " + description +
                ", Entry Fee: £" + entryFee + ", Date: " + date;
    }
}
