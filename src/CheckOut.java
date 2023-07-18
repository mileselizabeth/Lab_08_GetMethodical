import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        double priceOfItem = 0;
        boolean moreItems = false;
        double totalCost = 0;
        Scanner in = new Scanner(System.in);
        do {
            priceOfItem = SafeInput.getRangedDouble(in, "What is the price of your item?", .50, 10.00);
            totalCost = totalCost + priceOfItem;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items [Y or N]?");
        }
        while(moreItems);
        System.out.printf("%.2f", totalCost);

    }

}
