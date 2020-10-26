package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rule r = new Rule();
		GameControll gc = new GameControll();
		Scanner scan = new Scanner(System.in);

		gc.start();
		scan.nextLine();
		r.turnAction();

	}

}
