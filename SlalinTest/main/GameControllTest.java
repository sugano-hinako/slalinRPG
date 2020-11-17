package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameControllTest {
	@Test
	public void testStart() {
		GameControll gc = new GameControll();
		String gsmsg = gc.start();
		String name = "スラリン";
		assertEquals(name + "の冒険スタート！\n" + "※Enterキーを押すと進みます\n" +name + "は歩いている",gsmsg);
	}
	@Test
	public void testShowMonster() {
		GameControll gc = new GameControll();
		String showM = gc.showMonster();
		String monsterA = "ももんじゃA";
		String monsterB = "オタオタB";
		assertEquals(monsterA + "　と　" + monsterB + "がとびだしてきた！！",showM);
	}

}
