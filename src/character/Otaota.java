package character;

import java.util.Random;

public class Otaota extends Monster{
	Random rand = new Random();

	public Otaota() {
		this.name = "謎のオタオタ";
		this.hp = 774;
		this.individual = 'X';
	}

	public Otaota(char individual) {
		this.name = "オタオタ";
		this.hp = 198;
		this.individual = individual;
	}

	public void attack(Player p) {
		int da = rand.nextInt(40)+20;
		System.out.println(this.name + "は尻尾で叩いた！");
		System.out.println(p.name + "に" + da + "ダメージを与えた！");
		p.hp -= da;
	}

}
