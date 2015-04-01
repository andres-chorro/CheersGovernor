package game;

import java.util.Scanner;

public class Runner {
	private static CheersGovernor game = new CheersGovernor();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("[P]lay\n[Q]uit");
			if (sc.nextLine().equalsIgnoreCase("q"))
				return;
			runThrough();
		}
	}

	private static void runThrough() {
		Entity[] list = game.getTheList();
		for (Entity e : list) {
			System.out.println(e);
			System.out.println("Type [enter] if right : [x] if wrong");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("x"))
				return;
		}
		System.out.println("CHEERS GOVERNOR!!!");
		ruleMenu();
	}

	private static void ruleMenu() {
		boolean done = false;
		while (!done) {
			System.out.println("Create a rule!\n[S]wap\n[R]ename\n[M]isc");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("s")) {
				System.out.println("Enter first Number to swap:");
				int a = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter second Number to swap:");
				int b = sc.nextInt();
				sc.nextLine();
				game.swap(a, b);
				done = true;
			} else if (input.equalsIgnoreCase("r")) {
				System.out.println("Enter number to rename:");
				int number = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name:");
				String name = sc.nextLine();
				game.rename(number, name);
				done = true;
			} else if (input.equalsIgnoreCase("m")) {
				done = true;
			} else {
				System.out.println("Invalid Input");
			}

		}

	}
}
