package coffeeshop;

public class coffeebrew extends coffee {

	private String numcu;
	private String model;
	private String wasu;
	coffeebrew(String code,String des,double price,String model,String numcu){
		super(code,des,price);
		this.model=model;
		this.numcu=numcu;
		this.wasu=wasu;
	}
	public String getmodel() {
		return model;
	}
	
	public String getnumcu() {
		return numcu;
	}
	public String getwatersupply() {
		return wasu;
	}
	@Override
	public String toString() {
		return super.toString() + "_"+model+"_"+numcu;
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}