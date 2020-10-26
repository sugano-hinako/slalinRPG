package main;

import java.util.Scanner;

import character.Momonjya;
import character.Otaota;
import character.Player;

public class Rule {
	//今回登場のプレイヤーとモンスター's
	Player pl = new Player();
	Momonjya mo = new Momonjya('A');
	Otaota ota = new Otaota('∞');

	//
	Scanner scan = new Scanner(System.in);

	//なんのモンスターが出てきたか表示する
	public void showMonster() {
		System.out.println(mo.name + "　と　" + ota.name + "がとびだしてきた！！");
	}

	int count = 1;

	//ターン中の動き
	public void turnAction() {
		do{
			System.out.println("▼ターン" + count);
			//何をするかの指定
			pl.setAction();
			pl.actionName();
			pl.action();
			if (pl.action == 1) {
				pl.choiceMonster();
				pl.chMonster();
				if (pl.chMonster == 1) {
					pl.setChoice();
					pl.choiceName();
					pl.choice();
					if (pl.choice == 1) {
						pl.swordAttack(mo);
					} else if (pl.choice == 2) {
						pl.attack(mo);
					}
				} else if (pl.chMonster == 2) {
					pl.setChoice();
					pl.choiceName();
					pl.choice();
					if (pl.choice == 1) {
						pl.swordAttack(ota);
					} else if (pl.choice == 2) {
						pl.attack(ota);
					}
				}
			} else if (pl.action == 2) {
				pl.run();
				System.exit(0);
			}
			scan.nextLine();
			if(mo.hp >= 0) {
				mo.attack(pl);
				scan.nextLine();
			}
			if(ota.hp >= 0) {
				ota.attack(pl);
				scan.nextLine();
			}
			System.out.println("---------------");
			System.out.println(pl.name + "HP：" + pl.hp);
			System.out.println("");
			System.out.println(mo.name + "　HP：" + mo.hp + "　　 " + ota.name + "　HP：" + ota.hp);
			System.out.println("---------------");
			scan.nextLine();
			count ++;
		}while(pl.hp >= 0 && ( mo.hp >= 0 || ota.hp >= 0));
		//TODO プレイヤーのHPがなくなったら負けモンスターのHPがなくなったら負けというようにしたい

	}


}
