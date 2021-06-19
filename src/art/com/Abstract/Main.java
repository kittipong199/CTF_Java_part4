package art.com.Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProductFrontPage [] products = new IProductFrontPage[4];
		products[0] = new Product("100","" ,"ขายไปแล้ว")
		Product x = new Product("100", "", "ขายไปแล้ว");
		x.StatusProduct = StatusProduct.Status.DRAFT;
	}

}
