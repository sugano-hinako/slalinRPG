package main;

import java.util.Scanner;

import character.Momonjya;
import character.Otaota;
import character.Player;
/** コメントサンプル */
public class GameControll {
	private Player plSlalin;
	private Momonjya moMomonjya;
	private Otaota moOtaota;

	public GameControll() {
		this.plSlalin = new Player();
		this.moMomonjya = new Momonjya('A');
		this.moOtaota = new Otaota('B');
	}

	Turn r = new Turn();
	Scanner scan = new Scanner(System.in);

	//ゲームスタート
	public String start() {
		System.out.println(this.plSlalin.name + "の冒険スタート！");
		System.out.println("※Enterキーを押すと進みます");
		scan.nextLine();
		System.out.println(this.plSlalin.name + "は歩いている");
		scan.nextLine();
		return this.plSlalin.name + "の冒険スタート！\n" + "※Enterキーを押すと進みます\n" +
		this.plSlalin.name + "は歩いている";
	}

	//なんのモンスターが出てきたか表示する
	public String showMonster() {
		System.out.println(this.moMomonjya.name + "　と　" + this.moOtaota.name + "がとびだしてきた！！");
		scan.nextLine();
		return this.moMomonjya.name + "　と　" + this.moOtaota.name + "がとびだしてきた！！";
	}

}
