package javaSandboxOneLevelTwo;

import java.util.ArrayList;

public class ObjectArraysClass 
	{
	public static void main(String [] args)
		{
			ArrayList<String> $Fish = new ArrayList<String>();
				$Fish.add("Starfish");
				$Fish.add("Oyster Toadfish");
				$Fish.add("Black Drum");
				$Fish.add("Lizardfish");
				$Fish.add("Jumping Mullet");
				$Fish.add("Silver Perch");
				$Fish.add("Haddock");
				$Fish.add("Knobbed Porgy");
				$Fish.add("Sea Mullet");
				$Fish.add("Blacktip Shark");
	
			ArrayList<String> $Birds = new ArrayList<String>();
				$Birds.add("Green-naped Pheasant Pigeon");
				$Birds.add("Bridled White-eye");
				$Birds.add("White-eared Catbird");				
				$Birds.add("Scissor-tailed Flycatcher");				
				$Birds.add("Red-fronted Macaw");				
				$Birds.add("Blue-grey Tanager");
				$Birds.add("Black-headed Gonolek");
				$Birds.add("Hamerkop");				
				$Birds.add("Scarlet-headed Blackbird");				
				$Birds.add("Sudan Golden Sparrow");
				
			ArrayList<String> $Snakes = new ArrayList<String>();
				$Snakes.add("Langaha Nasuta");
				$Snakes.add("Long Nosed Vine Snake");
				$Snakes.add("Hognosed Pitviper");
				$Snakes.add("Coral Cobra");
				$Snakes.add("Black Racer");
				$Snakes.add("Black Mamba");
				$Snakes.add("Mamushi");
				$Snakes.add("Philippine Cobra");
				$Snakes.add("Ball Python");
				$Snakes.add("Water Cobra");
				
			ArrayList<String> $Mammals = new ArrayList<String>();
				$Mammals.add("Duckbill Platypus");
				$Mammals.add("Cougar");
				$Mammals.add("Leopard");
				$Mammals.add("Mandrill");
				$Mammals.add("Antelope");
				$Mammals.add("Buffalo");
				$Mammals.add("Raccoon");
				$Mammals.add("Cheetah");
				$Mammals.add("Okapi");
				$Mammals.add("impala");
				
			ArrayList<ArrayList<String>> $Animals = new ArrayList<ArrayList<String>>();
				$Animals.add($Mammals);					
				$Animals.add($Snakes);
				$Animals.add($Birds);
				$Animals.add($Fish);
				
				for (int $i=0; $i<$Animals.size();$i++)
					{
						System.out.println();
						for (int $j=0; $j<$Animals.get($i).size();$j++)
							{
								System.out.println($Animals.get($i).get($j));
							}
					}								
		}
	}