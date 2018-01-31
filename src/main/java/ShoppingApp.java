import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {

		MasterShoppingOrder myOrder = new MasterShoppingOrder();

		// myOrder.addShoppingOrder(new ShoppingOrder("Shampoo ", 3.75,2.00));
		//
		// myOrder.showOrder();

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name of the Item you'd like to purchase:");
		String itemName = input.nextLine();

		System.out.println("Enter the unit price");
		double itemPrice = input.nextDouble();

		System.out.println("Enter the quantity:");
		double itemQuantity = input.nextDouble();
		input.nextLine();

		myOrder.addShoppingOrder(new ShoppingOrder(itemName, itemPrice, itemQuantity));

		System.out.println("Would you like to continue shopping? Y or N");
		String continueShopping = input.nextLine();

		while (continueShopping.equalsIgnoreCase("y")) {
			System.out.println("Enter the name of the Item you'd like to purchase:");
			String newItemName = input.nextLine();

			System.out.println("Enter the unit price");
			double newItemPrice = input.nextDouble();

			System.out.println("Enter the quantity:");
			double newItemQuantity = input.nextDouble();

			myOrder.addShoppingOrder(new ShoppingOrder(newItemName, newItemPrice, newItemQuantity));

			System.out.println("Your cart consists of: ");
			myOrder.showOrder();
			System.out.println(
					"The total price is " + myOrder.getTotalCartPrice() + " Total quantity is: " + myOrder.listsize());

			System.out.println("Would you like to continue shopping? Y or N");
			continueShopping = input.nextLine();
			input.nextLine();

		}

		// myOrder.showOrder();

		// System.out.println("Your total cart price is: " +
		// myOrder.getTotalCartPrice());

		// System.out.println("Would you like to continue shopping? Y or N");
		// continueShopping = input.nextLine();

	}

}
