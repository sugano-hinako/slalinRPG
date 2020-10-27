package main;

import java.util.Scanner;

import character.Momonjya;
import character.Otaota;
import character.Player;

public class Turn {
	//今回登場のプレイヤーとモンスター's
	Player pl = new Player();
	Momonjya mo = new Momonjya('A');
	Otaota ota = new Otaota('∞');

	//
	Scanner scan = new Scanner(System.in);

	int count = 1;

	//ターン中の動き
	public void turnAction() {
		do {
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
						if (mo.hp <= 0) {
							mo.hp = 0;
							System.out.println(mo.name + "を倒した！");
						}
					} else if (pl.choice == 2) {
						pl.attack(mo);
						if (mo.hp <= 0) {
							mo.hp = 0;
							System.out.println(mo.name + "を倒した！");
						}
					}
				} else if (pl.chMonster == 2) {
					pl.setChoice();
					pl.choiceName();
					pl.choice();
					if (pl.choice == 1) {
						pl.swordAttack(ota);
						if (ota.hp <= 0) {
							ota.hp = 0;
							System.out.println(ota.name + "を倒した！");
						}
					} else if (pl.choice == 2) {
						pl.attack(ota);
						if (ota.hp <= 0) {
							ota.hp = 0;
							System.out.println(ota.name + "を倒した！");
						}
					}
				}
			} else if (pl.action == 2) {
				pl.run();
				System.exit(0);
			}
			scan.nextLine();
			if (mo.hp >= 1) {
				mo.attack(pl);
				scan.nextLine();
			}
			if (ota.hp >= 1) {
				ota.attack(pl);
				scan.nextLine();
			}
			System.out.println("---------------");
			System.out.println(pl.name + "HP：" + pl.hp);
			System.out.println("");
			System.out.println(mo.name + "　HP：" + mo.hp + "　　 " + ota.name + "　HP：" + ota.hp);
			System.out.println("---------------");
			scan.nextLine();
			if (pl.hp == 0) {
				pl.die();
			} else if (mo.hp == 0 && ota.hp == 0) {
				System.out.println(pl.name + "の勝利！");
				System.exit(0);
			} else {
				count++;
			}
		} while (pl.hp >= 1 && (mo.hp >= 1 || ota.hp >= 1));

	}

}
