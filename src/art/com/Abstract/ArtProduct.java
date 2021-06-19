package art.com.Abstract;

public class ArtProduct extends AdstractProduct{

	final String quality = "good";
	
	public static void main(String[] args) {
		ArtProduct pro = new ArtProduct();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		
		return "hi hello";
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		
		return "30";
	}

}
