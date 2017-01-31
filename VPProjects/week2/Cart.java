public class Cart {

	private CartItem cartItems;

	public Cart() {
		cartItems = new CartItem();
	}

	public void printCart() {
		System.out.println("contents of cart : " + cartItems.toString());
	}

}
