public class Members {
    private String MemberName;
    private String MemberAddress;
    private String MemberEmail;
    private String MemberPhoneNumber;
    private String MembershipStartDate;
    private String MembershipDuration;
    private String MembershipType;
    private String CurrentTournaments;
    private String PastTournaments;

    public Members(String MemberName, String MemberAddress, String MemberEmail, String MemberPhoneNumber, String MembershipStartDate) {
        this.MemberName = MemberName;
        this.MemberAddress = MemberAddress;
        this.MemberEmail = MemberEmail;
        this.MemberPhoneNumber = MemberPhoneNumber;
        this.MembershipStartDate = MembershipStartDate;
        this.MembershipDuration = MembershipDuration;
        this.MembershipType = MembershipType;
        this.CurrentTournaments = CurrentTournaments;
        this.PastTournaments = PastTournaments;

    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemberAddress() {
        return MemberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        MemberAddress = memberAddress;
    }

    public String getMemberEmail() {
        return MemberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        MemberEmail = memberEmail;
    }

    public String getMemberPhoneNumber() {
        return MemberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        MemberPhoneNumber = memberPhoneNumber;
    }

    public String getMembershipStartDate() {
        return MembershipStartDate;
    }

    public void setMembershipStartDate(String membershipStartDate) {
        MembershipStartDate = membershipStartDate;
    }

    public String getMembershipDuration() {
        return MembershipDuration;
    }

    public void setMembershipDuration(String membershipDuration) {
        MembershipDuration = membershipDuration;
    }

    public String getMembershipType() {
        return MembershipType;
    }

    public void setMembershipType(String membershipType) {
        MembershipType = membershipType;
    }

    public String getCurrentTournaments() {
        return CurrentTournaments;
    }

    public void setCurrentTournaments(String currentTournaments) {
        CurrentTournaments = currentTournaments;
    }

    public String getPastTournaments() {
        return PastTournaments;
    }

    public void setPastTournaments(String pastTournaments) {
        PastTournaments = pastTournaments;
    }


    }