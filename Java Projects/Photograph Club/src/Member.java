public class Member {
    String MemberName;
    String MemberID;
    String MembershipType;
    Double MemberFeePaid;

    public Member() {

    }

    public Member(String MemberName, String MemberID, String MembershipType, Double MemberFeePaid) {
        this.MemberName = MemberName;
        this.MemberID = MemberID;
        this.MembershipType = MembershipType;
        this.MemberFeePaid = MemberFeePaid;
    }

    public String toString() {
        return MemberName + " " + MemberID + " " + MembershipType + " " + MemberFeePaid;
    }

    String getMemberName() {
        return MemberName;
    }

    String getMemberID() {
        return MemberID;
    }

    String getMembershipType() {
        return MembershipType;
    }

    Double getMemberFeePaid() {
        return MemberFeePaid;
    }
}
