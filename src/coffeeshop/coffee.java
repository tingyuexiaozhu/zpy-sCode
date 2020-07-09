package coffeeshop;
import java.io.*;
public class coffee implements Serializable{
	private String code;
	private String des;
	private double price;
	coffee(String code,String des,double price){
		this.code=code;
		this.des=des;
		this.price=price;
	}
	public String getcode() {
		return code;
	}
	public String getdes() {
		return des;
	}
	public double price() {
		return price;
	}
	
	@Override
	public String toString() {
		return code+"_"+des+"_"+price;
	}
	
	@Override
	public boolean equals(Object c1) {
		coffee cc=(coffee)c1;
		// TODO Auto-generated method stub
		return cc.code.equals(c1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
