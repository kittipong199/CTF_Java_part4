package art.com.Abstract;

public abstract class AdstractProduct implements IProductFrontPage {
	private String name = "";
	private String lastname = "";
	public StatusProduct statusproduct;
	
	public abstract String getName();
	public abstract String getAge();
	
	public void printName() {
		System.out.println(this.name);
	}
	public void printAge() {
		System.out.println(this.lastname);
	}
}
