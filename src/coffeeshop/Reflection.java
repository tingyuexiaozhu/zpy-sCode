package coffeeshop;

import java.lang.reflect.Constructor;
import org.junit.Test;

public class Reflection {
	@Test
	public void test1() throws Exception {
		Class clazz=coffee.class;
		Constructor cons =clazz.getDeclaredConstructor(String.class,String.class,double.class);			
		cons.setAccessible(true);
		coffee c=(coffee)cons.newInstance("NO.1","nice",2.4);
		System.out.println(c);
		
	}
	
}
