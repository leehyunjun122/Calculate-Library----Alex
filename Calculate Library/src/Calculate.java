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
	public static double average(double number1, double number2) {
		double sum = number1+number2;
		return sum/2;
	}
	
	//returns the average of three doubles
	public static double average(double number1, double number2, double number3) {
		double sum = number1+number2+number3;
		return sum/3;
	}
	
	//convert Radians to Degrees
	public static double toDegrees(double radian) {
		double degree = (radian/3.14159)*180;
		return degree;
	}
	
	//convert Degrees to Radians
	public static double toRadians(double degree) {
		double radian = (degree/180)*3.14159;
		return radian;
	}
	
	//returns a double using three doubles
	public static double discriminant(double a, double b, double c) {
		double answer = (b*b)-(4*a*c);
		return answer;
	}
	
	//returns a improper fraction using three integers
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		int numeratorafter = (whole*denominator)+numerator;
		return (numeratorafter+"/"+denominator);
	}
	
	//returns a mixed number using two integers
	public static String toMixedNum(int numerator, int denominator) {
		int whole = numerator/denominator;
		int numeratorafter = numerator%denominator;
		return (whole+"_"+numeratorafter+"/"+denominator);
	}
	
	//returns a quadratic equation using four integers and a String
	public static String foil(int a, int b, int c, int d, String n) {
		int i1 = a*c;
		int i2 = (b*c)+(a*d);
		int i3 = b*d;
		return (i1+n+"^2 + "+i2+n+" + "+i3);
	}
	
	//returns boolean using two integers
	public static boolean isDivisibleBy(int num1, int num2) {
		if (num1%num2==0) {
			return true;
		}
		return false;
	}
	
	//returns absolute value of the double value
	public static double absValue(double number) {
		double answer = number;
		if (number<0) {
			return answer*(-1);
		}
		return answer;
	}
	
	//returns the largest value using two doubles
	public static double max(double num1, double num2) {
		if (num1<num2) {
			double max = num2;
			return max;
		} else {
			double max = num1;
			return max;
		}
	}
	
	//returns the largest value using three doubles
	public static double max(double num1, double num2, double num3) {
		if (num1>num2 && num1>num3) {
			double max = num1;
			return max;
		} else {
			if (num2>num1 && num2>num3) {
				double max = num2;
				return max;
			}else {
				double max = num3;
				return max;
			}
		}
	}
	
	//returns the lowest value using two integers
	public static int min(int num1, int num2) {
		if (num1<num2) {
			int min = num1;
			return min;
		} else {
			int min = num2;
			return min;
		}
	}
	
	//returns a double value after rounding up to the 2 decimal places
	public static double round2(double value) {
		double one = Calculate.absValue((int)(value * 100));
		double roundup = Calculate.absValue(value);
		if (100*roundup-one >=0.5) {
			roundup = (int) (roundup * 100 + 1);
			roundup = roundup/100;
		} else {
			roundup = (int) (roundup * 100);
			roundup = roundup/100;
		}
		if (value<=0){
			roundup = roundup * -1;
		}
		return roundup;
	}
	
	//returns a double after calculating with the exponent integer
	public static double exponent(double base, int exp) {
		int numofmultiplying = exp;
		double x = 1;
		for (int i = 0; i < numofmultiplying; i++) {
			x = x * base;
		}
		return x;
	}
	
	//returns a factorial of an accepted integer
	public static int factorial(int number) {
		int outcome = 1;
		for (int i = 2; i <= number; i++) {
			outcome = outcome * i;
		}	
		return outcome;
	}
	
	//Determines whether or not an integer is prime
	public static boolean isPrime(int value) {
		for (int i=2; i<value ; i++) {
			if(Calculate.isDivisibleBy(value, i) == true) {
				return false;
			}
		}
		return true;
	}
	
	//Calculates the greatest common factor of two integers
	public static int gcf(int num1, int num2) {
		int gcf = 1;
		int lowNum = Calculate.min(num1, num2);
		for (int i=2; i<lowNum; i++)
			if (Calculate.isDivisibleBy(num1, i) && Calculate.isDivisibleBy(num2, i) == true) {
				gcf = i;
			}
		return gcf;
	}
	
	
}







