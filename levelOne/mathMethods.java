/**
 * 
 */
package levelOne;
/**
 * @author Table
 *
 */
public class mathMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14159265358979; double y = -10;
		double max = Math.max(x,y); // The maximum value math method.
		System.out.print("\n The larger number is "+max+"\n");
		long a = 3984; long b = 9340;
		double min = Math.min(a,b); // The minimum math method.
		System.out.print("\n The smaller number is "+min+"\n");
		double abs = Math.abs(y); // The absolute value math method.
		System.out.print("\n The absolue value of the number "+y+" is "+abs+"\n");
	    double c = a+b+x+abs; 
		double sqrt = Math.sqrt(c); // The square root value math method.
		System.out.print("\n The absolue value of the number "+c+" is "+sqrt+"\n");
		double round = Math.round(x); // The rounding math method.
		System.out.print("\n The rounded value of the number "+x+" is "+round+"\n");
		double ceil = Math.ceil(x); // The always rounds up math method
		System.out.print("\n The rounded up value of the number "+x+" is "+ceil+"\n");		
		double floor = Math.floor(x); // The always rounds up math method
		System.out.print("\n The rounded down value of the number "+x+" is "+floor+"\n");		
	
	}

}
