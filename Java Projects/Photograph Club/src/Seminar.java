import java.util.ArrayList;

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
}