package character;

import java.util.Random;

public class Momonjya extends Monster {
	Random rand = new Random();

	public Momonjya() {
		this.name = "謎のももんじゃ";
		this.hp = 774;
		this.individual = 'X';
	}

	public Momonjya(char individual) {
		this.name = "ももんじゃ";
		this.hp = 138;
		this.individual = individual;
	}

	public void attack(Player p) {
		//ダメージを設定 30~59のランダムなダメージ
		int da = rand.nextInt(20) * 10 + 30;
		System.out.println(this.name + "は体当たりした！");
		System.out.println(p.name + "に" + da + "ダメージを与えた！");
		p.hp -= da;
	}


}
