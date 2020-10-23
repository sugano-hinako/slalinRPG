package main;

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

	//ゲームスタート
	public void start() {
		System.out.println(this.plSlalin.name +"の冒険(簡易版)スタート！");
		System.out.println("なにかがくさかげからとび出してきた！");
		System.out.println("");
	}


}
