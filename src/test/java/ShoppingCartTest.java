import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void shouldInitiateAShoppingCartOrder() {
		ShoppingOrder underTest = new ShoppingOrder();
		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldInitiateAnOrderWithItemInfo() {
		ShoppingOrder underTest = new ShoppingOrder("Shampoo", 5.50, 2);
		double check = underTest.getItemQuantity();
		Assert.assertEquals(2, check, 0.01);
	}

	@Test
	public void shouldInitiateAnOrderWithItemInfo2() {
		ShoppingOrder underTest = new ShoppingOrder("Shampoo", 5.50, 2);
		double check = underTest.getItemPrice();
		Assert.assertEquals(5.50, check, 0.01);
	}

	@Test
	public void shouldInitiateAnOrderWithItemInfo3() {
		ShoppingOrder underTest = new ShoppingOrder("Shampoo", 5.50, 2);
		String check = underTest.getItemName();
		Assert.assertEquals("Shampoo", check);
	}

	@Test
	public void shouldReturnTotalPriceWithQtyAndPrice() {
		ShoppingOrder underTest = new ShoppingOrder("Shampoo", 5.50, 2);
		double check = underTest.getTotalOrderPrice();
		Assert.assertEquals(11.00, check, 0.01);
	}

	@Test
	public void shouldInitiateMasterShoppingOrder() {
		MasterShoppingOrder underTest = new MasterShoppingOrder();
		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldReturnQuantityofItemsOrdered1() {
		MasterShoppingOrder underTest = new MasterShoppingOrder();
		underTest.addShoppingOrder(new ShoppingOrder("water", 1.00, 4));
		int check = underTest.listsize();
		Assert.assertEquals(1, check);
	}

	@Test
	public void shouldReturnQuantityofItemsOrdered() {
		MasterShoppingOrder underTest = new MasterShoppingOrder();
		underTest.addShoppingOrder(new ShoppingOrder("water", 1.00, 4));
		underTest.addShoppingOrder(new ShoppingOrder("water", 1.00, 4));
		int check = underTest.listsize();
		Assert.assertEquals(2, check);
	}

	@Test
	public void shouldReturnTotalPrice2() {
		MasterShoppingOrder underTest = new MasterShoppingOrder();
		underTest.addShoppingOrder(new ShoppingOrder("water", 1.75, 4));
		underTest.addShoppingOrder(new ShoppingOrder("water", 2.00, 4));
		underTest.addShoppingOrder(new ShoppingOrder("water", 2.15, 4));
		double check = underTest.getTotalCartPrice();
		Assert.assertEquals(23.60, check, 0.01);
	}
	
	@Test 
	public void shouldRemoveAnItem(){
		MasterShoppingOrder underTest = new MasterShoppingOrder();
		underTest.addShoppingOrder(new ShoppingOrder("water", 1.25, 3));
		underTest.addShoppingOrder(new ShoppingOrder("shoes", 22.50, 1));
		underTest.addShoppingOrder(new ShoppingOrder("shampoo", 2.25, 2));
		underTest.removeItem("water");
		int check = underTest.listsize();
		Assert.assertEquals(2, check);
	}
	
	@Test 
	public void shouldRemovePartialItem(){
		MasterShoppingOrder underTest = new MasterShoppingOrder();
		underTest.addShoppingOrder(new ShoppingOrder("water", 1.25, 3));
		underTest.addShoppingOrder(new ShoppingOrder("shoes", 22.50, 1));
		underTest.addShoppingOrder(new ShoppingOrder("shampoo", 2.25, 2));
		underTest.removePartialItem( new ShoppingOrder("water", 1.25, 1));
		double check = underTest.getTotalCartPrice();
		Assert.assertEquals(29.50, check, 0.01);
	}
}
