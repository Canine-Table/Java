package javaSandboxOneLevelOne;

public class MethodsClass 
	{

		static void Name(String $Name)
			{
				System.out.println("Hello "+$Name);
			}
		static void Return(String $Name) 
			{
				Name($Name);
			 	System.out.print("How is your day going today?\n\n");
			}
	    public int CompareNum()   
		    {   
		        int x = 3;
		        int y = 8;
		        System.out.println("x = " + x + "\ny = " + y);
		        if(x>y)
		            return x;
		        else
		            return y;
		    }
		 public int Int()
		 {
			 int a = 4;
			 return a;
		 }
	public static void main(String [] args)
		{
			Name("John");
			Name("Tom");
			Name("Bill");
			Return("Frank");
			MethodsClass obj = new MethodsClass();
	        int result = obj.CompareNum();
			System.out.println("The greater number among x and y is: " + result);
	        int a = obj.Int();
	        System.out.println("The number is: "+a);
		}
	}