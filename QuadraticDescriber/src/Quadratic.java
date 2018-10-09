/*This class contain methods that can perform various math operations that are related to Quadratics. 
 * @author Alex Lee
 * @versions October 2, 2018
 */

public class Quadratic {
	//returns the square of the input
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer;
	}
	
	//returns a value of discriminant using three double values of coefficients of quadratic equation
	public static double discriminant(double a, double b, double c) {
		double discriminant = (b*b)-(4*a*c);//the formula for the discriminant is b^2 - 4ac
		return discriminant;
	}
	
	//returns a quadratic form by converting a binomial multiplication of form (ax+b)(cx+d)
	public static String foil(double a, double b, double c, double d, String n) {
		double coefficientX2 = a*c;//coefficient of x^2
		double coefficientX = (b*c)+(a*d);//coefficient of x
		double constant = b*d;//constant value
		return (coefficientX2+n+"^2 + "+coefficientX+n+" + "+constant);
	}
	
	//returns absolute value of the double value
	public static double absValue(double number) {
		if (number<0) {
			return number*(-1);//converting the negative value to positive
		}
		return number;
	}
	
	//returns the lowest value using two doubles
	public static double min(double number1, double number2) {
		if (number1<number2) {
			double min = number1;
			return min;
		} else {
			double min = number2;
			return min;
		}
	}
			
	//returns the largest value using two doubles
	public static double max(double number1, double number2) {
		if (number1<number2) {
			double max = number2;
			return max;
		} else {
			double max = number1;
			return max;
		}
	}
	
	//rounds the double value up to the 2 decimal places
	public static double round2(double value) {
		double wholeNum = Quadratic.absValue((int)(value * 100));//absolute value of input*100 that includes two decimal place values
		double roundUp = Quadratic.absValue(value);//absolute value of the input
		if (100*roundUp-wholeNum >=0.5) {//if greater than 0.5, it means that the 3rd decimal would be rounded up to 0.01
			roundUp = (int) (roundUp * 100 + 1);
			roundUp = roundUp/100;
		} else {
			roundUp = (int) (roundUp * 100);
			roundUp = roundUp/100;
		}
		if (value<=0){
		roundUp = roundUp * -1;//if the input was negative, convert the roundup to negative value
		}
		return roundUp;
	}
	
	//returns a double after calculating with the exponent integer
	public static double exponent(double base, int power) {
		int numOfMultiplying = power;
		double x = 1;
		if (power<0) {
			throw new IllegalArgumentException ("no negative number used for this code");
		}
		for (int i = 0; i < numOfMultiplying; i++) {//multiplying the base as many times as the power
			x = x * base;
		}
		return x;
	}
	
	//approximates the square root of the value passed
	public static double sqrt(double value) {
		double guess;
		double squareRoot = value/2;
		if (value<0) {
			throw new IllegalArgumentException ("no negative value for the square root");
		} else {
		for (int i=0; i<=value; i++) {
			guess = squareRoot;
			squareRoot = (guess + (value/guess))/2;
		}
		}
		return (Quadratic.round2(squareRoot));
	}
	
	//approximates the real roots using the quadratic formula
	public static String quadForm (int a, int b, int c) {
		double root1;
		double root2;
		double onlyRoot;
		double rootA;
		double rootB;
		double maxRoot;
		double lowRoot;
		double sqrtOfDiscriminant = Quadratic.discriminant(a, b, c);
		if (sqrtOfDiscriminant<0) {
			return ("no real roots");
		} else if (sqrtOfDiscriminant==0) {//if the discriminant is equal to zero, there is only one real root
			onlyRoot = Quadratic.round2((-b/(2*a)));
			return onlyRoot+"";
		}
		else {//if the discriminant is greater than zero, there is two real roots
			rootA = Quadratic.round2(((-1*b)-(Quadratic.sqrt(sqrtOfDiscriminant)))/2*a);
			root1 = rootA;
			rootB = (Quadratic.round2((-1*b)+(Quadratic.sqrt(sqrtOfDiscriminant)))/2*a);
			root2 = rootB;
			lowRoot = Quadratic.min(root1, root2);
			maxRoot = Quadratic.max(root1, root2);
			return ("\""+lowRoot+" and "+maxRoot+"\"");//the lowest value comes first
		}
	}
}




