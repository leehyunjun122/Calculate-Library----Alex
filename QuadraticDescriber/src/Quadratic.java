/*This class contain methods that can perform various math operations that are related to Quadratics. 
 * @author Alex Lee
 * @versions October 2, 2018
 */

public class Quadratic {
	//describes the quadratic using the three double coefficient values passed
	public static String quadrDescriber (double a, double b, double c) {
		if (a == 0) {//if a is 0, it's a linear equation.
			throw new IllegalArgumentException("This equation is not quadratic");
		}
		double vertexX = -1 * b/(2 * a);
		if (vertexX==-0.0) {
			vertexX = 0.0;
		}
		double axisOfSym = round2(vertexX);//axis of symmetry is same as the x-coordinate of vertex
		double vertexY = a * vertexX * vertexX + b * vertexX + c;//substituting x of the equation as x-coordinate of vertex 
		if (vertexY==-0.0) {
			vertexY = 0.0;
		}
		String vertex = "(" + round2(vertexX) + ", " + round2(vertexY) + ")";//rounds up the values of vertex
		double interceptY = round2(c);//in standard form, only c remains when the x is 0
		if (interceptY==-0.0) {
			interceptY = 0.0;
		}
		String root = "";
		double discriminant = Quadratic.discriminant(a, b, c);
		if (discriminant < 0) {//if discriminant is less than 0, it has no real root
			root = "No roots";
		}else {
			if (discriminant == 0) {//if discriminant = 0, it has only one real root
				double onlyRoot =  round2((-b/(2*a)));
				root = "" + onlyRoot;
			}else {
				double firstRoot =  round2(((-b + Quadratic.sqrt(discriminant))/(2*a)));//using quadratic formula (+)
				double secondRoot =  round2(((-b - Quadratic.sqrt(discriminant))/(2*a)));//using quadratic formula (-)
				if (firstRoot==-0.0) {
					firstRoot = 0.0;
				}
				if (secondRoot==-0.0) {
					secondRoot = 0.0;
				}
				if (firstRoot < secondRoot){
					root = firstRoot + " and " + secondRoot;
				}else {
					root = secondRoot + " and " + firstRoot;
				}
			}
		}
		String concave = "";//if the graph opens upward or downward
		if (a < 0){
			concave = "Down";
		} else {
			concave = "Up";
		}
		return "Description of the graph of:" + "\ny = " + a + " x^2 +" + b + " x +" + c + "\n\nOpens: " + concave + "\nAxis of Symmetry: " + axisOfSym + "\nVertex: " + vertex + "\nx-intercept(s): " + root + "\ny-intercept: " + interceptY;
	}
	
	//returns a value of discriminant using three double values of coefficients of quadratic equation
	public static double discriminant(double a, double b, double c) {
		double discriminant = (b*b)-(4*a*c);//the formula for the discriminant is b^2 - 4ac
		return discriminant;
	}
	
	//returns absolute value of the double value
	public static double absValue(double number) {
		if (number<0) {
			return number*(-1);//converting the negative value to positive
		}
		return number;
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
}




