package javaSandboxOneLevelOne;

public class TwoDimensionalArrayClass {

	public static void main( String [] args)
		{
			String $Garage[][] = new String[3][3];
			
			$Garage[0][0] = "Nissan Versa";
			$Garage[0][1] = "Chevrolet Bolt";
			$Garage[0][2] = "Audi A4";
			
			$Garage[1][0] = "Audi A5";
			$Garage[1][1] = "Mercedes-Benz C-Class";
			$Garage[1][2] = "Honda Civic";
			
			$Garage[2][0] = "Volkswagen GTI";
			$Garage[2][1] = "Kia Rio";
			$Garage[2][2] = "Hyundai Accent";
			
			for (int i=0;i<$Garage.length;i++)
				{
					System.out.println();
					for (int j=0;j<$Garage[i].length;j++)
						{
							System.out.println("\t"+$Garage[i][j]);
						}
				}
			
			String $Slots[][] = {
									{"Nissan Versa", "Chevrolet Bolt", "Audi A4"},
									{"Audi A5", "Mercedes-Benz C-Class", "Honda Civic"},
									{"Volkswagen GTI", "Kia Rio", "Hyundai Accent"}
								};
			
			for (int k=0;k<$Slots.length;k++)
			{
				System.out.println();
				for (int l=0;l<$Slots[k].length;l++)
					{
						System.out.println("\t"+$Slots[k][l]);
					}
			}
		}
	}