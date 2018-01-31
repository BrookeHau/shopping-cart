
public class ShoppingOrder {
	
	public String itemName;
	public double itemPrice;
	public double itemQuantity;
	public double totalOrderPrice; 
	public ShoppingOrder(){
		
	}
	
	public ShoppingOrder (String itemName, double itemPrice, double itemQuantity){
		this.itemName =itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public double getItemQuantity() {
		return itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public String getItemName() {
		return itemName;
	}
	
	public double getTotalOrderPrice(){
		return totalOrderPrice = itemPrice * itemQuantity; 
	}
	
}
