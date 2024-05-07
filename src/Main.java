public class Main {

    public static void main(String[] args){

        MemberList.memberList.add(new Member());
        MemberList.memberList.add(new Member());
        MemberList.memberList.add(new Member());


        Controller.createNewMember();
        MemberList.listWhoNeedsToPay();
        MemberList.retrieveMemberInfoFromMemberID();
    }
}
