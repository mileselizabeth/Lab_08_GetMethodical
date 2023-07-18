import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        String UserName = "";
        Scanner in = new Scanner(System.in);
        UserName = SafeInput.getNonZeroLenString(in, "Enter your user name");
    }
}
