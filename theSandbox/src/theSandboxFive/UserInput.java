/**
 * 
 */
package theSandboxFive;
import java.util.Scanner;
/**
 * @author Table
 *
 */
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		System.out.print("What is your name: ");
		String Name = Input.nextLine();
		System.out.print("Hello "+Name+" How old are you: ");
		int Age = Input.nextInt();
		System.out.print(Name+" is "+Age+"  years old. What is your favorite food: ");
		Input.next();
		
	}

}
