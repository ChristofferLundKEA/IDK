import java.util.Scanner;

public class InputManager { // mangler try/catch.

    static Scanner newScanner = new Scanner(System.in);

    public static String takeScannerString(String prompt){
        System.out.println(prompt);
        return newScanner.nextLine();
    }

    public static int takeScannerInt(String prompt){
        System.out.println(prompt);
        int thisInt = newScanner.nextInt();
        newScanner.nextLine(); // clear buffer
        return thisInt;
    }

    public static boolean takeScannerBool(String prompt){
        System.out.println(prompt);
        if(newScanner.nextLine().equalsIgnoreCase("y")) return true;
        else return false;
    }
}
