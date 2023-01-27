/**
 * Lemon class for interface
 * @author Nick Oberlin
 * @version 1-27-2023
 *
 */

public class Lemon extends Fruit {

	@Override
	public void taste() {
		System.out.println("It tastes sour.");
	}

	@Override
	public void look() {
		System.out.println("It is yellow and has bumpy skin.");
	}
}
