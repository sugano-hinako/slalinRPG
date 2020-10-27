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
		System.out.println(this.name + "は負けてしまった、");
		System.out.println("その後" + this.name + "の姿を見たものは誰もいなかった…");
		System.out.println("- GAMEOVER -");
	}

	public void swordAttack(Monster m) {
		int swordDamage = rand.nextInt(20) + 85;
		System.out.println(this.name + "は剣で切りつけた！");
		System.out.println(m.name + "に" + swordDamage + "ダメージを与えた!");
		m.hp -= swordDamage;
	}

	public void attack(Monster m) {
		int attackDamage = rand.nextInt(20) + 65;
		System.out.println(this.name + "は体当たりした！");
		System.out.println(m.name + "に" + attackDamage + "ダメージを与えた!");
		m.hp -= attackDamage;

	}

	//ここで入れた数値によってPlayerが戦うのか逃げるのか選択する
	public int action; //こうげきorにげる
	public int choice; //剣or体当たり
	public int count = 0;

	//何をするか指定
	public void setAction() {
		do {
			System.out.println("何をしますか？");
			System.out.println("たたかう：１　にげる：２");
		} while (!isNumber());
	}

	private boolean isNumber() {
		//3回以上間違えたら強制的ににげるが選択される
		if (count < 3) {
			try {
				Scanner scan = new Scanner(System.in);
				this.action = scan.nextInt();
				if (!(action == 1 || action == 2)) {
					System.out.println("たたかう：１　か　にげる：２を選んでね！");
					count++;
					return false;
				}
				return true;
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
				return false;
			}
		} else {
			this.action = 2;
			return true;
		}
	}

	//行動の名称を返す
	public String actionName() {
		String actionName = null;
		if (this.action == 1)
			actionName = "たたかう！";
		if (this.action == 2)
			actionName = "にげる！";
		return actionName;
	}

	public int action() {
		return this.action;
	}

	//どう攻撃するかを選択
	public void setChoice() {
		do {
			System.out.println("何でたたかう？");
			System.out.println("剣でこうげき：１　たいあたり：２");
		} while (!isNumber2());
	}

	private boolean isNumber2() {
		//3回以上間違えたら強制的にたいあたりが選択される
		if (count < 3) {
			try {
				Scanner scan = new Scanner(System.in);
				this.choice = scan.nextInt();
				if (!(choice == 1 || choice == 2)) {
					System.out.println("剣でこうげき：１　か　たいあたり：２　を選んでね！");
					count++;
					return false;
				}
				return true;
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
				return false;
			}
		} else {
			this.choice = 2;
			return true;
		}
	}

	//攻撃の名称を返す
	public String choiceName() {
		String choiceName = null;
		if (this.choice == 1)
			choiceName = "剣でこうげき!";
		if (this.choice == 2)
			choiceName = "たいあたりでこうげき!";
		return choiceName;
	}

	public int choice() {
		return this.choice;
	}

	//プレイヤーとモンスター's
	Momonjya mo = new Momonjya('A');
	Otaota ota = new Otaota('∞');
	public int chMonster;

	//どちらのモンスターにこうげきするか決める
	public void choiceMonster() {
		do {
			System.out.println("どのモンスターをこうげきする？");
			System.out.println("▼" + mo.name + "：１" + "  " + "▼" + ota.name + "：２");
		} while (!isNumber3());
	}

	private boolean isNumber3() {
		//3回以上間違えたら強制的にももんじゃが選択される
		if (count < 3) {
			try {
				Scanner scan = new Scanner(System.in);
				this.chMonster = scan.nextInt();
				if (!(chMonster == 1 || chMonster == 2)) {
					System.out.println(mo.name + "：１　か" + ota.name + "：２　を選んでね！");
					count++;
					return false;
				}
				return true;
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してね！");
				count++;
				return false;
			}
		} else {
			this.chMonster = 2;
			return true;
		}
	}

	public int chMonster() {
		return this.chMonster;
	}

}
