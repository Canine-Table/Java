package javaSandboxOneLevelOne;

public class ArrayClass {

	public static final String[] $Boolean = {"No","Yes"};
	static String[] $Value = {"A","B","C"};
	public static void main(String[] args)
		{
			String[] $Vehicles = {"Chevrolet Bolt", "Audi A4", "Audi A5", "Mercedes-Benz C-Class", "Honda Civic","Volkswagen GTI", "Kia Rio","",""};
			$Vehicles[7] = "Hyundai Accent";
			$Vehicles[8] = "Nissan Versa";
			String[] _Vehicles = new String[9];
			_Vehicles[0] = "Chevrolet Bolt";
			_Vehicles[1] = "Audi A4";
			_Vehicles[2] = "Audi A5";				
			_Vehicles[3] = "Mercedes-Benz C-Class";
			_Vehicles[4] = "Honda Civic";
			_Vehicles[5] = "Volkswagen GTI";
			_Vehicles[6] = "Kia Rio";				
			_Vehicles[7] = "Hyundai Accent";
			_Vehicles[8] = "Nissan Versa";			
			System.out.println("\n\t"+$Boolean[1]+" or "+$Boolean[0]);
			System.out.println("\t"+$Value[0]+$Value[1]+$Value[2]);
			for (int i=0; i<$Vehicles.length; i++)
				{
					System.out.println("\tthe vehicle in the number "+i+" slot is the  "+$Vehicles[i]);
				}
			System.out.println("");
			for (int j=0; j<_Vehicles.length; j++)
			{
				System.out.println("\tthe vehicle in the number "+j+" slot is the  "+_Vehicles[j]);
			}
		}
}
