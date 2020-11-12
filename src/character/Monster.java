package character;
//slalin_Test
public abstract class Monster {
	public String name;
	public int hp;
	char individual;

	//逃げるはどの敵も共通
	public String run() {
		//System.out.println(this.name + "は逃げ出した！");
		return this.name + "は逃げ出した！";
	}

	//attack()を抽象メソッドとして宣言
	//敵ごとに攻撃方法を指定する
	public abstract int attack(Player p);

}
