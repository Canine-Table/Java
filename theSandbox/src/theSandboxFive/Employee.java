/**
 * 
 */
package theSandboxFive;

/**
 * @author Table
 *
 */
public class Employee 
{
	String name;
	String job;
	double salary;
	int age;
	
	public Employee(String _Name)
		{
			this.name = _Name;
		}
	public Employee(String _Name, int _Age, String _Job, double _Salary)
		{
			this.name = _Name;
			this.age = _Age;
			this.job = _Job;
			this.salary = _Salary;

		}
	public void $Job(String _Job)
		{
			job = _Job;
		}
	public void $Salary(double _Salary)
		{
			salary = _Salary;
		}
	public void $Age(int _Age)
		{
			age = _Age;
		}
	public void $Print()
		{
			System.out.printf("\t%-20s%-20d%-20s$%,.2f%n", 
					this.name,
					this.age,
					this.job, 
					this.salary);
		}
	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
		System.out.printf("%n\t%-20s%-20s%-20s%-20s%n%n", "Name", "Age", "Job", "Salary");
			Employee John = new Employee("John");
				John.$Age(26);
				John.$Salary(143223.021);
				John.$Job("Handyman");
				John.$Print();
			Employee Dan = new Employee("Dan");
				Dan.$Age(19);
				Dan.$Salary(1433424.021);
				Dan.$Job("Java Guru");
				Dan.$Print();
			Employee Ben = new Employee("Ben");
				Ben.$Age(19);
				Ben.$Salary(14343243.021);
				Ben.$Job("PowerShell Fiend");
				Ben.$Print();
			Employee Paul = new Employee("Paul");
				Paul.$Age(78);
				Paul.$Job("Slacker");
				Paul.$Salary(339429832.021);
				Paul.$Print();
			Employee Streets = new Employee("Steets", 99, "Car", 45954);
				Streets.$Print();
	}
}
