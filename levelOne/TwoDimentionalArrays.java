/**
 * 
 */
package levelOne;

/**
 * @author Table
 *
 */
public class TwoDimentionalArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String twoD[][] = {{"a","b","c","d","e","f","g","h","i","j","k","l","m"},
						  {"n","o","p","q","r","s","t","u","v","w","x","y","z"}};
		for ( int i = 0 ; i < twoD.length ; i++ ) {
			System.out.print("\n\t");
			for ( int j = 0 ; j < twoD[i].length ; j++ ) {
				System.out.print(twoD[i][j]+" ");
			}
		}			  
	}

}