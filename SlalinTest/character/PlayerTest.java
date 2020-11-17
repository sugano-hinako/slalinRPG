package character;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	/*
	@Test
	public void testPlayerRun() {
		Player pl = new Player();
		String runmsg = pl.run();
		assertEquals(pl.name + "は逃げ出した！", runmsg);
	}

	@Test
	public void testPlayerDie() {
		Player pl = new Player();
		String diemsg = pl.die();
		assertEquals(pl.name + "は負けてしまった、\nその後"
				+ pl.name + "の姿を見たものは誰もいなかった…\n- GAMEOVER -", diemsg);
	}

	@Test
	public void testPlayerAttack() {
		Player pl = new Player();
		Momonjya mo = new Momonjya('X');
		int beforeHp = mo.hp;
		pl.swordAttack(mo);
		int afterHp = mo.hp;
		boolean actual = beforeHp > afterHp;
		assertEquals(true, actual);
	}
	*/

	//1を選択したらたたかうが表示されるか
	/*
	@Test
	public void testSetAction() {
		Player pl = new Player();
		pl.setAction();
		pl.actionName();
		String setAc = pl.actionName();
		assertEquals("たたかう！", setAc);
	}
	*/

	//期待した数値を入力されなかった際にfalseになっているか
	/*
	@Test
	public void testIsNumberCase1() {
		Player pl = new Player();
		boolean isNum = pl.isNumber(1);
		assertEquals(true, isNum);
	}
	@Test
	public void testIsNumberCase2() {
		Player pl = new Player();
		boolean isNum = pl.isNumber(2);
		assertEquals(true, isNum);
	}
	@Test
	public void testIsNumberCase3() {
		Player pl = new Player();
		boolean isNum = pl.isNumber(3);
		assertEquals(false, isNum);
	}
	*/
//引数countのテスト
	/*
	@Test
	public void testIsNumberCaseCount1() {
		Player pl = new Player();
		boolean isNum = pl.isNumber(1);
		assertEquals(false,isNum);
	}
	@Test
	public void testIsNumberCaseCount2() {
		Player pl = new Player();
		boolean isNum = pl.isNumber(4);
		assertEquals(true,isNum);
	}
	@Test
	public void testIsNumberCaseCount3() {
		Player pl = new Player();
		boolean isNum = pl.isNumber(-1);
		assertEquals(false,isNum);
	}
	*/

	//引数に数値以外を入れるテストをしたい
	@Test
	public void testIsNumberCase4() {
		Player pl = new Player();
	}
	//

	//actionNameのテスト
	@Test
	public void testActionName1() {
		Player pl = new Player();
		pl.action = 1;
		String acName = pl.actionName(1);
		assertEquals("たたかう！", acName);
	}
	@Test
	public void testActionName2() {
		Player pl = new Player();
		pl.action = 2;
		String acName = pl.actionName(2);
		assertEquals("にげる！", acName);
	}

}
