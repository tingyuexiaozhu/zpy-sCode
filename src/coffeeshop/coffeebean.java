package coffeeshop;

public class coffeebean extends coffee {
	private String origin;
	private String roast;
	private String flavor;
	private String aroma;
	private String acidity;
	private String body;
	coffeebean(String code,String des,double price,String origin,String roast){
		super(code,des,price);
		this.roast=roast;
		this.origin=origin;
	}
	public String getroast() {
		return roast;
	}
	
	public String getorigin() {
		return origin;
	}
	@Override
	public String toString() {
		return super.toString() + "_"+roast+"_"+origin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
