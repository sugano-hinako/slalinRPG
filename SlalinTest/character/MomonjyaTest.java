package character;

import static org.junit.Assert.*;

import org.junit.Test;

public class MomonjyaTest {
	@Test
	public void testMomonjyaRun(){
		Momonjya mo = new Momonjya('X');
		String runmsg = mo.run();
		assertEquals(mo.name + "は逃げ出した！",runmsg);
	}
	@Test
	public void testMomonjyaAttack() {
		Momonjya mo = new Momonjya('X');
		Player p = new Player();
		int atdmg = mo.attack(p);
		assertEquals(da,atdmg);
	}

}