import java.util.Scanner;
public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String SSN = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String studentNumber = "";
        studentNumber = SafeInput.getRegExString(in, "Enter your student number", "^(M|m)\\d{5}$");
        String menuChoice = "";
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice", "^[OoSsVvQq]$");
    }


}
