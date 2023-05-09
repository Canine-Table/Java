package javaSandboxOneLevelTwoGarage;

public class Employee
	{
		boolean $Employee;
		boolean $Broke;
		String $Name;
		Employee()
			{
			
			}
		
		Employee(String _Name,boolean _Employee, boolean _Broke)
			{
				this.$Employee = _Employee;
				this.$Broke = _Broke;
				this.$Name = _Name;
				
			}
		
		String Name() 
			{
				return $Name;
			}
		
		boolean isEmployee()
			{
				return $Employee;
			}
		
		boolean isBroke()
			{
				return $Broke;
			}		
		public String toString()
			{
			return "\n\tName: "+this.$Name+"\n\tEmployee Status: "+this.$Employee+"\n\tBroke Status: "+this.$Broke;
			}
	}