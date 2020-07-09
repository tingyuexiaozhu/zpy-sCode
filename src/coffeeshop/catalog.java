package coffeeshop;

import java.util.*;

public class catalog implements Iterable<coffee> {
	 private ArrayList<coffee> cof;
	 catalog(){
		cof=new ArrayList<>();
	}
	 public void addnew(coffee c) {
		 cof.add(c);
	 }
	 public void remove(coffee c) {
		 cof.remove(c);
	 }
	 public coffee getcoff(String code) {
		 for(coffee co:cof) {
			 if(co.getcode().equals(code)) {
				 return co;
			 }
		 }
		 return null;
	 }
	
	 public int getnum() {
		 return cof.size();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public Iterator<coffee> iterator() {
		// TODO Auto-generated method stub
		return cof.iterator();
	}
	
	

}
