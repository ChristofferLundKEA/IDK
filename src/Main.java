public class Main {

    public static void main(String[] args){

//        MemberList.memberList.add(new Member());
//        MemberList.memberList.add(new Member());
//        MemberList.memberList.add(new Member());

        while (true) {
            int quepasa = InputManager.takeScannerInt("\nWho are you?" +
                    "\n1. Admin" +
                    "\n2. Trainer" +
                    "\n3. Accountant");

            if (quepasa == 1) {
                int admin = InputManager.takeScannerInt("Do you want to:" +
                        "\n1. Create new member?");

                switch (admin) {
                    case 1:
                        Controller.createNewMember();
                        break;
                }
            }

            if (quepasa == 2) {
                int trainer = InputManager.takeScannerInt("Do you want to: " +
                        "\n1. Add new result to member " +
                        "\n2. Search for member by name or ID");

                switch (trainer) {
                    case 1:
                        Controller.createNewResult();
                        break;
                    case 2:
                        MemberList.lookUpMember();
                        break;
                }
            }

            if (quepasa == 3) {
                int accountant = InputManager.takeScannerInt("Do you want to: " +
                        "\n1. See list of members late on payment " +
                        "\n2. Change payment-status on member");

                switch (accountant) {
                    case 1:
                        MemberList.listWhoNeedsToPay();
                        break;
                    case 2:
                        MemberList.editMemberHasPaidStatus();
                        break;
                }
            }
        }
    }
}