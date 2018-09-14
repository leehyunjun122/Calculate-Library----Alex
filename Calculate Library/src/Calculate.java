 /*This class contain methods that perform various math operations.
  * @author Alex Lee
  * @versions September 6, 2018
  */
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer;
	}
	
	//returns the cube of the input
	public static int cube(int number) {
		int answer;
		answer = number*number*number;
		return answer;
	}
	
	//returns the average of two doubles
	public static double average(double i1, double i2) {
		double sum = i1+12;
		return sum/2;
	}
	
	//returns the average of three doubles
	public static double average(double i1, double i2, double i3) {
		double sum = i1+12+13;
		return sum/3;
	}
	
	//convert Radians to Degrees
	public static double toDegrees(double i) {
		double a = (i/3.14159)*180;
		return a;
	}
	
	//convert Degrees to Radians
	public static double toRadians(double i) {
		double a = (i/180)*3.14159;
		return a;
	}
	
	//returns a double using three doubles
	public static double discriminant(double a, double b, double c) {
		double answer = (b*b)-4*a*c;
		return answer;
	}
	
	//returns a improper fraction using three integers
	public static String toImproperFrac(int a, int b, int c) {
		int i = (a*c)+b;
		return (i+"/"+c);
	}
	
	//returns a mixed number using two integers
	public static String toMixedNum(int a, int b) {
		int i1 = a/b;
		int i2 = a%b;
		return (i1+"_"+i2+"/"+b);
	}
	
	//returns a quadratic equation using four integers and a String
	public static String foil(int a, int b, int c, int d, String n) {
		int i1 = a*c;
		int i2 = (b*c)+(a*d);
		int i3 = b*d;
		return (i1+n+"^2 + "+i2+n+" + "+i3);
	}
	
	//returns boolean using two integers
	public static boolean isDivisibleBy(int a, int b) {
		boolean i=a%b==0;
		return i;
	}
	
	//returns absolute value of the double
	public static double absValue(double a) {
		return Math.abs(a);
	}
	
	//returns the largest value using to doubles
	public static double max(double a, double b) {
		return (Math.max(a, b));
	}
	
	//returns the largest value using three doubles
	public static double max(double a, double b, double c) {
		return (Math.max(a, Math.max(b, c)));
	}
	
	//returns the lowest value using two integers
	public static int min(int a, int b) {
		return (Math.min(a, b));
	}
	
	//returns a double after rounding up to the 2 decimal places
	public static double round2(double a) {
		double answer = (double)(Math.round(a*100))/100;
		return answer;
	}
	
	//returns a double after calculating with the exponent integer
	public static double exponent(double a, int b) {
		double answer = Math.exp(a);
		return answer;
	}
}







