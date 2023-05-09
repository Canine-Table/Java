package mainGarage;

/** @author Table */

public interface PeopleActions 
	{
		abstract void Walking();
		abstract void Running();
		abstract void Sleeping();
		abstract void Eating();
		
		abstract void setName(String _Name);
		abstract void setFirstName(String _First);
		abstract void setMiddleName(String _Middle);
		abstract void setLastName(String _Last);
		abstract void setJobTitle(String _Title);
		abstract void setProfession(String _Profession);		
		
		abstract void setAge(int _Age);
		
		abstract void setSalary(float _Salary);
		abstract void setWeight(float _Weight);
		abstract void setHeight(float _Height);

		abstract String getName();
		abstract String getFirstName();
		abstract String getMiddleName();
		abstract String getLastName();
		abstract String getJobTitle();
		abstract String getProfession();		
		
		abstract int getAge();
		
		abstract float getSalary();
		abstract float getWeight();
		abstract float getHeight();
	}