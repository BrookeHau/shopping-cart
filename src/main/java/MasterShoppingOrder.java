import java.util.ArrayList;
import java.util.List;


public class MasterShoppingOrder {

	private List<ShoppingOrder> items = new ArrayList<>();
	
	public double totalPrice;

	public void addShoppingOrder(ShoppingOrder theOrder) {
		items.add(theOrder);
	}

	public int listsize() {
		return items.size();
	}

	public double getTotalCartPrice() {
		double totalPrice = 0;
		for (ShoppingOrder item: items){
			totalPrice += item.getTotalOrderPrice();
		} return totalPrice; 
	}
	
	public void showOrder(){
		for(ShoppingOrder item: items){
			System.out.println("Item: " + item.getItemName() + " Quantity: " + item.getItemQuantity() + " Price " + item.getItemPrice());
		}
	}

	public void removeItem(String removeItem) {
			for (int i = items.size() - 1; i >= 0; i--) {
				if (items.get(i).getItemName().equals(removeItem)) {
					items.remove(i);
				}
			}
	}

	public void removePartialItem(ShoppingOrder removePartialItem) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getItemName().equals(removePartialItem)) {
				items.remove(i);
			}
		}
		
	}
 
	
}
