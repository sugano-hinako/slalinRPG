package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Turn r = new Turn();
		GameControll gc = new GameControll();
		Scanner scan = new Scanner(System.in);

		gc.start();
		gc.showMonster();
		r.turnAction();

	}

}
