package main;

import character.Momonjya;
import character.Otaota;
import character.Player;

public class Rule {
	//今回登場のプレイヤーとモンスター's
	Player pl = new Player();
	Momonjya mo = new Momonjya('A');
	Otaota ota = new Otaota('∞');

	//なんのモンスターが出てきたか表示する
	public void showMonster() {
		System.out.println(mo.name + "　と　" + ota.name + "がとびだしてきた！！");
	}

	//Player
	public void playerAction() {
		//何をするかの指定
		pl.setAction();
		pl.actionName();
		pl.action();
		if(pl.action == 1) {
			pl.choiceMonster();
			pl.chMonster();
			if(pl.chMonster == 1) {
				pl.setChoice();
				pl.choiceName();
				pl.choice();
			}
		}
	}


}
