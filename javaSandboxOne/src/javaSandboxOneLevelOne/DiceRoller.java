package javaSandboxOneLevelOne;

import java.util.Random;

public class DiceRoller {
	DiceRoller()
	{
		Random $Dice = new Random();
		int $Roll = 0;
		roll($Dice,$Roll);
	}
	void roll(Random _Dice,int _Roll)
		{
			_Roll = _Dice.nextInt(6)+1;
			System.out.println(_Roll);
		}
}