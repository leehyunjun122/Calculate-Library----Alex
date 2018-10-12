import java.util.Scanner;

/*This class contain main methods that perform various math operations 
 * that handles interactions with the user.
 * @author Alex Lee
 * @versions October 2, 2018
 */
public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean done = false;
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("created by Alex Lee");
		System.out.print("Provide values for coefficients a, b, and c");
		while (!done) {
			System.out.print("\na: ");
			double a = input.nextDouble();
			System.out.print("b: ");
			double b = input.nextDouble();
			System.out.print("c: ");
			double c = input.nextDouble();
			System.out.println();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println();
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			input.nextLine();// Consume newline left-over
			String answer = input.nextLine();
			String result = answer.replaceAll("\\s","");//remove spaces
			if (result.toLowerCase().contains("quit")) {//if the input contains the word "quit" regardless of the caps 
				done = true;
			}
		}
		input.close();
	}
}







