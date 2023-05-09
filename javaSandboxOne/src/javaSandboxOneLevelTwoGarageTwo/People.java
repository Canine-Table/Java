package javaSandboxOneLevelTwoGarageTwo;

public class People extends Vehicle
	{
		People()
			{
				
			}

		People(String _Name)
			{
				this.$Name = _Name;
			}
		
		People(String _First, String _Middle, String _Last)
		{
			this.$FirstName = _First;
			this.$MiddleName = _Middle;
			this.$LastName = _Last;
		}		

		People(String Name, String _First, String _Middle, String _Last)
		{
			this.$Name = _First;
			this.$FirstName = _First;
			this.$MiddleName = _Middle;
			this.$LastName = _Last;
		}

		People(String _Name, String _First, String _Middle, String _Last, String _Profession, String _JobTitle, int _Age, float _Height, float _Weight, float _Salary)
			{
				this.$Name = _Name;
				this.$FirstName = _First;
				this.$MiddleName = _Middle;
				this.$LastName = _Last;
				this.$Profession = _Profession;
				this.$JobTitle = _JobTitle;
				this.$Height = _Height;
				this.$Weight = _Weight;
				this.$Salary = _Salary;
				this.$Age = _Age;
			}

		public String getName()
			{
				return $Name;
			}		
				public void setName(String _Name)
					{
						this.$Name = _Name;
					}
	
		public String getFirst()
			{
				return $FirstName;
			}	
				public void setFirst(String _First)
					{
						this.$FirstName = _First;
					}	
				
		public String getMiddle()
			{
				return $MiddleName;
			}
				public void setMiddle( String _Middle)
					{
						this.$MiddleName = _Middle;
					}
						
		public String getLast()
			{
				return $LastName;
			}
				public void setLast(String _LastName)
					{
						this.$LastName = _LastName;
					}
		
		public String getProfession()
			{
				return $Profession;
			}
				public void setProfession(String _Profession)
					{
						this.$Profession = _Profession;
					}
			
		public String getJob()
			{
				return $JobTitle;
			}
				public void getJob(String _Job)
					{
						this.$JobTitle = _Job;
					}
			
		public int getAge()
			{
				return $Age;
			}	
				public void setAge(int _Age)
					{
						this.$Age = _Age;
					}	
	
		public float getHeight()
			{
				return $Height;
			}	
				public void setHeight(float _Height)
					{
						this.$Height = _Height;
					}
					
		public float getWeight()
			{
				return $Weight;
			}	
				public void getHeight(float _Weight)
					{
						this.$Weight = _Weight;
					}	
	
		public float getSalary()
			{
				return $Salary;
			}
				public void setSalary(float _Salary)
					{
						this.$Salary = _Salary;
					}
		void Walking()
			{
				System.out.println($Name+" is taking a stroll.");
			}
		void Running()
			{
				System.out.println($Name+" is running.");
			}	
		void Sleeping()
			{
				System.out.println($Name+" is currently asleep.");
			}
		void Eating()
			{
				System.out.println($Name+" is eating food.");
			}
	}