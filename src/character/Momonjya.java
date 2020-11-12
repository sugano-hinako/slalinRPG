package character;

import java.util.Random;

public class Momonjya extends Monster {
	Random rand = new Random();

	public Momonjya() {
		this.individual = 'X';
		this.name = "謎のももんじゃ"+individual;
		this.hp = 774;
	}

	public Momonjya(char individual) {
		this.individual = individual;
		this.name = "ももんじゃ"+individual;
		this.hp = 138;
	}

	public int attack(Player p) {
		//ダメージを設定 30~59のランダムなダメージ
		/** コメントサンプル */
		int da = rand.nextInt(20) + 30;
		System.out.println(this.name + "は体当たりした！");
		System.out.println(p.name + "に" + da + "ダメージを与えた！");
		p.hp -= da;
		return da;
	}


}
