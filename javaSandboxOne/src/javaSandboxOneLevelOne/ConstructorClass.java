package javaSandboxOneLevelOne;

public class ConstructorClass {

	public class Human
		{
			String $Name = null;
			int $Age = 0;
			double $Weight = 0.0;
			Human(String _Name, int _Age, double _Weight )
				{
					$Name = _Name;
					$Age = _Age;
					$Weight = _Weight;
				}
			void walking()
				{
					System.out.println($Name+" is currently walking");
				}
			void eating()
				{
					System.out.println($Name+" is currently eating");
				}
			void sleep()
				{
					System.out.println($Name+" is currently asleep");
				}
		}
	public static void main(String [] args)
		{
			ConstructorClass.Human Tom = new ConstructorClass().new Human("Tim",3,3);
			System.out.println("Hello, this is "+Tom.$Name+". I am currently "+Tom.$Age+" and weight around "+Tom.$Weight+" Pounds.");
			Tom.sleep();
			Tom.eating();
			Tom.walking();
		}
}
