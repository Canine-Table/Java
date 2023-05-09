/**
 * 
 */
package levelTwo;

/**
 * @author Table
 *
 */
public class Temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = {
				{"Ford","Mustang","74,555","2022"},
				{"Dodge","Caravan","18,950","2015"},
				{"Mazda","MX-5 Miata","27,650","2014"},
				{"Honda","Civic","19,430","2020",},
				{"Chevrolet","Corvette","53,343","2003"},
				{"Toyota","Corolla","24,243","2021"}};
		System.out.println("\n\n\t===================================================================");
		System.out.printf("\t%-20s %-20s %-20s %-20s","Make","Model","Cost","Year");
		System.out.println("\n\t===================================================================");
		System.out.printf("%n\t%-20s %-20s %-20s %-20s",array[0][0],array[0][1],array[0][2],array[0][3]);
		System.out.printf("%n\t%-20s %-20s %-20s %-20s",array[1][0],array[1][1],array[1][2],array[1][3]);
		System.out.printf("%n\t%-20s %-20s %-20s %-20s",array[2][0],array[2][1],array[2][2],array[2][3]);
		System.out.printf("%n\t%-20s %-20s %-20s %-20s",array[3][0],array[3][1],array[3][2],array[3][3]);
		System.out.printf("%n\t%-20s %-20s %-20s %-20s",array[4][0],array[4][1],array[4][2],array[4][3]);
		System.out.println("\n\n\t===================================================================");
	}
	
}
