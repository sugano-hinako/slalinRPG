package character;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {
	public String name;
	public int hp;
	Random rand = new Random();

	public Player() {
		this.name = "スラリン";
		this.hp = 893;
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	public void die() {
		System.out.println("その後" + this.name + "の姿を見たものは誰もいなかった…");
		System.out.println("- GAMEOVER -");
	}

	public void swordAttack(Monster m) {
		int swordDamage = rand.nextInt(20) * 10 + 45;
		System.out.println(this.name + "は剣で切りつけた！");
		System.out.println(m.name + "に" + swordDamage + "ダメージを与えた!");
		System.out.println("");
		m.hp -= swordDamage;
	}

	public void attack(Monster m) {
		int attackDamage = rand.nextInt(20) * 10 + 25;
		System.out.println(this.name + "は体当たりした！");
		System.out.println(m.name + "に" + attackDamage + "ダメージを与えた!");
		System.out.println("");
		m.hp -= attackDamage;

	}

	//ここで入れた数値によってPlayerが戦うのか逃げるのか選択する
		private int action; //こうげきorにげる
		private int choice; //剣or体当たり
		private int count = 0;

		//何をするか指定
		public void setAction() {
			do {
				System.out.println("何をしますか？");
				System.out.println("たたかう：１　にげる：２");
			} while (!isNumber());
		}

		private boolean isNumber() {
			//3回以上間違えたら強制的ににげるが選択される
			if(count < 3) {
				try {
					Scanner scan = new Scanner(System.in);
					this.action = scan.nextInt();
					if (!(action == 1 || action == 2)) {
						System.out.println("たたかう：１　か　にげる：２を選んでね！");
						count++;
						return false;
					}
					return true;
				}catch (InputMismatchException e) {
					System.out.println("数値を入力してね！");
					count++;
					return false;
				}
			}else {
				this.action = 2;
				return true;
			}
		}

		//行動の名称を返す
		public String actionName() {
			String actionName = null;
			if (this.action == 1) actionName = "たたかう！";
			if (this.action == 2) actionName = "にげる！";
			return actionName;
		}

		public int action() {
			return this.action;
		}

		//どう攻撃するかを選択

}
