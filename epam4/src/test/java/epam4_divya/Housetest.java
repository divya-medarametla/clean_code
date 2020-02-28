package epam4_divya;

import static org.junit.Assert.*;

import org.junit.Test;

public class Housetest {

	Completehouse ch=new Completehouse();
	
	@Test
	public void test() {
		assertEquals(2400,ch.construct("Standard",2),5);
		assertEquals(3000,ch.construct("Abovestandard",2),5);
		assertEquals(540000,ch.construct("Highstandards",300),5);
		assertEquals(2500,ch.construct("Excellentstandard",1),5);
	}

}
