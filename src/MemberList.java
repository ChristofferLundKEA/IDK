import java.util.ArrayList;

public class MemberList {

    static ArrayList<Member> memberList = new ArrayList<>();

    public static void listWhoNeedsToPay(){
        for (Member thisMember : memberList) {
            if (thisMember.hasPaid == false) System.out.println(thisMember.firstName + " "
                    + thisMember.surName + "| ID:" + thisMember.memberID);
        }
    }

    public static void retrieveMemberInfoFromMemberID(){ // lookUpMember() does the job
        int input = InputManager.takeScannerInt("What memberID do you want information on?");
        for(Member thisMember : memberList){
            if (thisMember.memberID == input) System.out.println(thisMember);
        }
    }

    public static void lookUpMember(){
        int lookup = InputManager.takeScannerInt("Do you want to look up member by: \n1. Name \n2. ID");

        if (lookup == 1){
            String name = InputManager.takeScannerString("What name are you looking for?");
            for (Member member : memberList){
                if (member.firstName.equals(name) || member.surName.equals(name)){
                    System.out.println(member);
                }
            }
        }
        if (lookup == 2){
            int ID = InputManager.takeScannerInt("Which ID do you want to look up?");
            for (Member member : memberList){
                if (member.memberID == ID){
                    System.out.println(member);
                }
            }
        }
    }

    public static void editMemberHasPaidStatus(){
        int idtochange = InputManager.takeScannerInt("Which ID do you want to update payment status on?");
        boolean found = false;
        for (int i = 0; i < MemberList.memberList.size(); i++){
            if (MemberList.memberList.get(i).memberID == idtochange) {
                found = true;
                    if(MemberList.memberList.get(i).hasPaid) MemberList.memberList.get(i).hasPaid = false; // toggle to opposite
                    else MemberList.memberList.get(i).hasPaid = true; // toggle to opposite
            }
        }
        if (!found) System.out.println("No such ID found");
        else{}; // write to file
    }
}
