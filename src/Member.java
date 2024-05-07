public class Member {
    String firstName;
    String surName;
    String gender;
    boolean hasPaid = false;
    boolean isActiveMember = true;
    int team;
    int age;
    int memberID;
    int phoneNumber;

    @Override
    public String toString() {
        return "Member: \n" +
                "FirstName: " + firstName +
                "\nSurname: " + surName +
                "\nGender: " + gender +
                "\nThis person has paid: " + hasPaid +
                "\nThis person is active: " + isActiveMember +
                "\nTeam: " + team +
                "\nAge: " + age +
                "\nMemberID: " + memberID +
                "\nPhone: " + phoneNumber;
    }
}
