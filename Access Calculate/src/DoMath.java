 /*This class is client code that uses the Calculate Library to perform various mathematical tasks.
  * @author Alex Lee
  * @versions September 6, 2018
  */
public class DoMath {
	
	public static void main(String[] args) {
		System.out.println(Calculate.square(55));
		System.out.println(Calculate.cube(55));
		System.out.println(Calculate.average(0,0));
		System.out.println(Calculate.average(0,0,0));
		System.out.println(Calculate.toDegrees(1.0));
		System.out.println(Calculate.toRadians(20.0));
		System.out.println(Calculate.discriminant(1, 5, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(3, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(3, 2));
		System.out.println(Calculate.absValue(-1000.0));
		System.out.println(Calculate.max(2.0, 3.0));
		System.out.println(Calculate.max(2.0, 3.0, 4.0));
		System.out.println(Calculate.min(2, 3));
		System.out.println(Calculate.round2(2.35628562));
		System.out.println(Calculate.exponent(2.0, 3));
		System.out.println(Calculate.sqrt(169));
	}

}





