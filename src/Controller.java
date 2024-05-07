public class Controller {

    public static void createNewMember() {
        Member newMember = new Member();

        newMember.firstName = InputManager.takeScannerString("First Name: ");
        newMember.surName = InputManager.takeScannerString("Surname: ");
        newMember.gender = InputManager.takeScannerString("Gender: ");
        // hasPaid is solved by accountant elsewhere and therefore is missing..
        // isActiveMember is true by default, because who is creating a deactivated membership?
        newMember.age = InputManager.takeScannerInt("Age: ");
        newMember.team = InputManager.takeScannerInt("Team: "); // is team not defined by age and "competition status"??
        newMember.memberID = MemberList.memberList.size() + 1;
        newMember.phoneNumber = InputManager.takeScannerInt("Phone Number: ");

        System.out.println("First name: " + newMember.firstName);
        System.out.println("Surname: " + newMember.surName);
        System.out.println("Gender: " + newMember.gender);
        System.out.println("Age: " + newMember.age);
        System.out.println("Team: " + newMember.team);
        System.out.println("Personal member ID: " + newMember.memberID);
        System.out.println("Phone: " + newMember.phoneNumber);

        String add = InputManager.takeScannerString("Add member to list? y/n");
        if (add.toLowerCase().equals("y")) MemberList.memberList.add(newMember); // fixing else-statement later :)
    }

    public static void createNewResult() {
        boolean found = false;
        int memberIDtoAddResultTo = InputManager.takeScannerInt("What memberID do you want to add a new result to?");
        for (int i = 0; i < MemberList.memberList.size(); i++){
            if (MemberList.memberList.get(i).memberID == memberIDtoAddResultTo) {
                found = true;
                Result newResult = new Result();
                newResult.discipline = InputManager.takeScannerString("Discipline: ");
                newResult.competitionName = InputManager.takeScannerString("Competition: ");
                newResult.resultInSeconds = InputManager.takeScannerInt("Time in seconds: ");
                Member.personalResults.add(newResult);
            }
        }
        if(!found) System.out.println("No such ID found");
    }
}
