import java.util.ArrayList;

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
    static ArrayList<Result> personalResults = new ArrayList<>();

    public String showPersonalResults(){
        StringBuilder newString = new StringBuilder();
        for (Result personalResult : Member.personalResults) {
            newString.append(personalResult);
            newString.append("\n");
        }
        return newString + "";
    }

    @Override
    public String toString() {
        return "Member: " +
                "\nFirstName: " + firstName +
                "\nSurname: " + surName +
                "\nGender: " + gender +
                "\nThis person has paid: " + hasPaid +
                "\nThis person is active: " + isActiveMember +
                "\nTeam: " + team +
                "\nAge: " + age +
                "\nMemberID: " + memberID +
                "\nPhone: " + phoneNumber +
                "\nResults: " + showPersonalResults();
    }
}
