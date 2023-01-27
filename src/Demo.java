/**
 *
 * Demo class for 1/27/2023 in-class activity reviewing Git and Java
 * @author Nick Oberlin
 * @version 1-27-2023
 *
 */

import java.util.Scanner;

public class Demo {

	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);	//get an input from user
		System.out.println("Enter either \"Fruit\", \"Lemon\", or \"Cherry\" to learn about each one.");
		input = kb.nextLine();

		if (input == "Fruit") {
			Fruit myFruit = new Fruit();
			myFruit.taste();
			myFruit.look();
		}
		if (input == "Lemon") {
			Fruit myLemon = new Lemon();
			myLemon.taste();
			myLemon.look();
		}
		if (input == "Cherry") {
			Fruit myCherry = new Cherry();
			myCherry.taste();
			myCherry.look();
		}
	}
}
