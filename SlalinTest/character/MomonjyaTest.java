package character;

import static org.junit.Assert.*;

import org.junit.Test;

public class MomonjyaTest {
	@Test
	public void testMomonjya(){
		Momonjya mo = new Momonjya('X');
		String runmsg = mo.run();
		assertEquals(mo.name + "は逃げ出した！",runmsg);
	}

}
