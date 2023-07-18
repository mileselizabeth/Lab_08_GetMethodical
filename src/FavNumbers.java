import java.util.Scanner;

public class FavNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int favInteger = 0;
            double favDouble = 0;
            favInteger = SafeInput.getInt(in, "What is your favorite integer?");
            favDouble = SafeInput.getDouble(in, "What is your favorite double?");

        }
}
