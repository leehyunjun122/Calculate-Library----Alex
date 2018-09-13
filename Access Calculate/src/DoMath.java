 /*This class is client code that uses the Calculate Library to perform various mathematical tasks.
  * @author Alex Lee
  * @versions September 6, 2018
  */
public class DoMath {
	
	public static void main(String[] args) {
		System.out.println(Calculate.square(55));
		System.out.println(Calculate.cube(55));
		System.out.println(Calculate.average(0,0));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(3, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
	}

}
