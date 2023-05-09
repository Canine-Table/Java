package mainGarage;

/** @author Table **/

public class People extends Vehicles implements PeopleActions
	{
	
	private int $Age = 55;
	private float $Height = 5.7f;
	private float $Weight = 143.48f;
	private float $Salary = 2036650.34f;
	private String $Name = "Gaius Julius Caesar";
	private String $FirstName = "Caesar";
	private String $MiddleName = "Gaius";
	private String $LastName = "Julius";
	private String $Profession = "Politician";
	private String $JobTitle = "Executive Magistrate";

		protected People()
			{
				
			}

		protected People(String _Name)
			{
				this.setName(_Name);
			}
		
		protected People(String _First, String _Middle, String _Last)
			{
				this.setFirstName(_First);
				this.setMiddleName(_Middle);
				this.setLastName(_Last);
			}		

		protected People(String _Name, String _First, String _Middle, String _Last)
			{
				this.setName(_Name);
				this.setFirstName(_First);
				this.setMiddleName(_Middle);
				this.setLastName(_Last);
			}

		People(String _Name, String _First, String _Middle, String _Last, String _Profession, String _JobTitle, int _Age, float _Height, float _Weight, float _Salary)
			{
				this.setName(_Name);
				this.setFirstName(_First);
				this.setMiddleName(_Middle);
				this.setLastName(_Last);
				this.setJobTitle(_JobTitle);
				this.setHeight(_Height);
				this.setWeight(_Weight);
				this.setSalary(_Salary);
				this.setAge(_Age);
			}

		protected void copyItem(People _People)
			{
				setModel(_People.getModel());
				setColor(_People.getColor());
				setMake(_People.getMake());
				setStyle(_People.getStyle());
				setYear(_People.getYear());
				setPrice(_People.getPrice());
				setHorsePower(_People.getHorsePower());
				setEfficiency(_People.getEfficiency());
				setMillage(_People.getMillage());
			}
		
		@Override
		public void setName(String _Name) 
			{
				this.$Name = _Name;
			}

		@Override
		public void setFirstName(String _First) 
			{
				this.$FirstName = _First;
			}

		@Override
		public void setMiddleName(String _Middle) 
			{
				this.$MiddleName = _Middle;
			}

		@Override
		public void setLastName(String _Last) 
			{
				this.$LastName = _Last;
			}

		@Override
		public void setJobTitle(String _Title) 
			{
				this.$Profession = _Title;
			}

		@Override
		public void setProfession(String _Profession) 
			{
				this.$Profession = _Profession;
			}

		@Override
		public void setAge(int _Age) 
			{
				this.$Age = _Age;	
			}

		@Override
		public void setSalary(float _Salary) 
			{
				this.$Salary = _Salary;	
			}

		@Override
		public void setWeight(float _Weight) 
			{
				this.$Weight = _Weight;	
			}

		@Override
		public void setHeight(float _Height) 
			{
				this.$Height = _Height;
			}

		@Override
		public String getName()
			{
				return this.$Name;
			}

		@Override
		public String getFirstName() 
			{
				return this.$FirstName;
			}
		
		@Override
		public String getMiddleName() 
			{
				return this.$MiddleName;
			}

		@Override
		public String getLastName()
			{
				return this.$LastName;
			}

		@Override
		public String getJobTitle() 
			{
				return this.$JobTitle;
			}

		@Override
		public String getProfession() 
			{
				return this.$Profession;
			}

		@Override
		public int getAge() 
			{
				return this.$Age;
			}

		@Override
		public float getSalary() 
			{
				return this.$Salary;
			}

		@Override
		public float getWeight() 
			{
				return this.$Weight;
			}

		@Override
		public float getHeight() 
			{
				return this.$Height;
			}	
		public void Walking()
			{
				System.out.println("\n\t"+getName()+" is taking a stroll.");
			}
		public void Running()
			{
				System.out.println("\n\t"+getName()+" is running.");
			}	
		public void Sleeping()
			{
				System.out.println("\n\t"+getName()+" is currently asleep.");
			}
		public void Eating()
			{
				System.out.println("\n\t"+getName()+" is eating food.");
			}
	}