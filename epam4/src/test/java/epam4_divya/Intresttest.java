package epam4_divya;

import static org.junit.Assert.*;

import org.junit.Test;

//import epam4_divya.Intrest_calculation;


public class Intresttest{
	Intrestcal it=new Intrestcal();
@Test
	public void test() {	
	assertEquals(3000,it.simpleintrest(10000,5,6),0);
}
@Test
	public void test1()
	{
	assertEquals(1276,it.compoundintrest(1000,5,5),2);
			}


}
