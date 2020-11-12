package character;

import java.util.Random;

public class Otaota extends Monster{
	Random rand = new Random();

	public Otaota() {

		this.individual = 'X';
		this.name = "謎のオタオタ"+individual;
		this.hp = 774;
	}

	public Otaota(char individual) {

		this.individual = individual;
		this.name = "オタオタ"+individual;
		this.hp = 198;
	}

	public int attack(Player p) {
		int da = rand.nextInt(40)+20;
		System.out.println(this.name + "は尻尾で叩いた！");
		System.out.println(p.name + "に" + da + "ダメージを与えた！");
		p.hp -= da;
		return da;
	}

}
