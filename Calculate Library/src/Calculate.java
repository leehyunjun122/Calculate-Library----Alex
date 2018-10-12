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
	
	//returns a value of discriminant using three double values of coefficients of quadratic equation
	public static double discriminant(double a, double b, double c) {
		double discriminant = (b*b)-(4*a*c);//the formula for the discriminant is b^2 - 4ac
		return discriminant;
	}
	
	//returns a improper fraction using three integers
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		if (denominator==0) {
			throw new IllegalArgumentException ("zero can't be denominator");
		}
		int numeratorAfter = (whole*denominator)+numerator;//calculating the numerator of the improper fraction
		return (numeratorAfter+"/"+denominator);
	}
	
	//returns a mixed number using two integers
	public static String toMixedNum(int numerator, int denominator) {
		if (denominator==0) {
			throw new IllegalArgumentException ("zero can't be denominator");
		}
		int whole = numerator/denominator;
		int remainder = numerator%denominator;//remainder is the new numerator of the mixed fraction
		if (remainder==0) {
			return (whole+"");
		}
		if (remainder<0) {//fraction only needs one negative sign to show that the number is negative
			remainder = remainder*-1;
			return (whole+"_"+remainder+"/"+denominator);
		}
		return (whole+"_"+remainder+"/"+denominator);
	}
	
	//returns a quadratic form by converting a binomial multiplication of form (ax+b)(cx+d)
	public static String foil(int a, int b, int c, int d, String n) {
		int coefficientX2 = a*c;//coefficient of x^2
		int coefficientX = (b*c)+(a*d);//coefficient of x
		int constant = b*d;//constant value
		return (coefficientX2+n+"^2 + "+coefficientX+n+" + "+constant);
	}
	
	//Determines whether or not one integer is evenly divisible by another integer
	public static boolean isDivisibleBy(int number, int factor) {
		if (factor==0) {
			throw new IllegalArgumentException ("number can't be divided by zero");
		}
		if (number%factor==0) {//if the remainder is 0, it completely divides
			return true;
		}
		return false;
	}
	
	//returns absolute value of the double value
	public static double absValue(double number) {
		if (number<0) {
			return number*(-1);//converting the negative value to positive
		}
		return number;
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
	
	//returns the largest value using three doubles
	public static double max(double number1, double number2, double number3) {
		if (number1>=number2 && number1>=number3) {//if the 1st number is the biggest
			double max = number1;
			return max;
		} else {
			if (number2>=number1 && number2>=number3) {//if the 2nd number is the biggest
				double max = number2;
				return max;
			}else {
				double max = number3;//if the 3rd number is the biggest
				return max;
			}
		}
	}
	
	//returns the lowest value using two integers
	public static int min(int number1, int number2) {
		if (number1<number2) {
			int min = number1;
			return min;
		} else {
			int min = number2;
			return min;
		}
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
	
	//rounds the double value up to the 2 decimal places
	public static double round2(double value) {
		double wholeNum = Calculate.absValue((int)(value * 100));//absolute value of input*100 that includes two decimal place values
		double roundUp = Calculate.absValue(value);//absolute value of the input
		if (100*roundUp-wholeNum >=0.5) {//if greater than 0.5, it means that the 3rd decimal would be rounded up to 0.01
			roundUp = (int) (roundUp * 100 + 1);
			roundUp = roundUp/100;
		} else {
			roundUp = (int) (roundUp * 100);
			roundUp = roundUp/100;
		}
		if (value<0){
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
	
	//returns a factorial of an accepted integer
	public static int factorial(int number) {
		int outcome = 1;
		if (number<0) {
			throw new IllegalArgumentException ("factorial can't be used for negative number");
		}
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
	public static int gcf(int number1, int number2) {
		int gcf = 1;
		int lowNum = Calculate.min(number1, number2);
		for (int i=2; i<lowNum; i++)
			if (Calculate.isDivisibleBy(number1, i) && Calculate.isDivisibleBy(number2, i) == true) {
				gcf = i;
			}
		return gcf;
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
		return (Calculate.round2(squareRoot));
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
		double sqrtOfDiscriminant = Calculate.discriminant(a, b, c);
		if (sqrtOfDiscriminant<0) {
			return ("no real roots");
		} else if (sqrtOfDiscriminant==0) {//if the discriminant is equal to zero, there is only one real root
			onlyRoot = Calculate.round2((-b/(2*a)));
			return onlyRoot+"";
		}
		else {//if the discriminant is greater than zero, there is two real roots
			rootA = Calculate.round2(((-1*b)-(Calculate.sqrt(sqrtOfDiscriminant)))/2*a);
			root1 = rootA;
			rootB = (Calculate.round2((-1*b)+(Calculate.sqrt(sqrtOfDiscriminant)))/2*a);
			root2 = rootB;
			lowRoot = Calculate.min(root1, root2);
			maxRoot = Calculate.max(root1, root2);
			return ("\""+lowRoot+" and "+maxRoot+"\"");//the lowest value comes first
		}
	}
}








