import java.util.Scanner;

/*This class contain main methods that perform various math operations 
 * that handles interactions with the user.
 * @author Alex Lee
 * @versions October 2, 2018
 */
public class QuadraticClient {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("created by Alex Lee");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.print("a: ");
		double a = input.nextDouble();
		System.out.print("b: ");
		double b = input.nextDouble();
		System.out.print("c: ");
		double c = input.nextDouble();
		System.out.println();
		System.out.println("Description of the graph of:");
		System.out.println("y = "+a+" x^2 + "+b+" x + "+c);
		System.out.println();
		System.out.println("Opens: ");
	}
}







