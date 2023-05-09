/**
 * 
 */
package levelTwo;

/**
 * @author Table
 *
 */
public class Human {

		String name;
		String gender;
		int age;
		double height;
		int weight;
	
	Human(String name, String gender, int age, double height, int weight){

		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;

		
	}
	
	void eat() {
		System.out.println("\n\n\t"+this.name+" is eating. *burp* ");
	}
	
	void drink() {
		System.out.println("\n\n\t"+this.name+" is drinking. ");
	}
	
}
