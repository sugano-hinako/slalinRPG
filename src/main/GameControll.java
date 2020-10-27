package main;

import java.util.Scanner;

import character.Momonjya;
import character.Otaota;
import character.Player;

public class GameControll {
	private Player plSlalin;
	private Momonjya moMomonjya;
	private Otaota moOtaota;

	public GameControll() {
		this.plSlalin = new Player();
		this.moMomonjya = new Momonjya();
		this.moOtaota = new Otaota();
	}

	Rule r = new Rule();
	Scanner scan = new Scanner(System.in);

	//ゲームスタート
	public void start() {
		System.out.println(this.plSlalin.name + "の冒険スタート！");
		System.out.println("※Enterキーを押すと進みます");
		scan.nextLine();
		System.out.println(this.plSlalin.name + "は歩いている");
		scan.nextLine();
	}
	//なんのモンスターが出てきたか表示する
	public void showMonster() {
		System.out.println(this.moMomonjya.name + "　と　" + this.moOtaota.name + "がとびだしてきた！！");
		scan.nextLine();
	}

}
