import java.util.ArrayList;

public class MemberList {

    static ArrayList<Member> memberList = new ArrayList<>();

    public static void listWhoNeedsToPay(){
        for (Member thisMember : memberList) {
            if (thisMember.hasPaid == false) System.out.println(thisMember.firstName + " "
                    + thisMember.surName + "| ID:" + thisMember.memberID);
        }
    }
    public static void retrieveMemberInfoFromMemberID(){
        int input = InputManager.takeScannerInt("What memberID do you want information on?");
        for(Member thisMember : memberList){
            if (thisMember.memberID == input) System.out.println(thisMember);
        }
    }
    public static void editMemberHasPaidStatus(){
        int idtochange = InputManager.takeScannerInt("Which ID do you want to update payment status on?");
    }
}
