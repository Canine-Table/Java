package javaSandboxOneLevelOne;

public class MathematicsClass {	
	public static void main(String [] args) {
	
		int $W = -283;
		int $X = 42922;
		int $Y = 9239;
		int $Z = 32903;
		double $Max = Math.max($X,$Y);
		double $Min = Math.min($Max,$Z);
		int $Absolute = Math.abs($W);
		double $SquareRoot = Math.sqrt($Z);
		double $Rounded = Math.round($SquareRoot);
		double $RoundUp = Math.ceil($SquareRoot);
		double $RoundDown = Math.floor($SquareRoot);
		System.out.println("The maximum value between "+$Y+" and "+$X+" is "+$Max);
		System.out.println("The minimum value between "+$X+" and "+$Y+" is "+$Min);
		System.out.println("The absolute value of the value "+$W+" is "+$Absolute);
		System.out.println("The sqare root of the value "+$Absolute+" is "+$SquareRoot);
		System.out.println("The rounded value of "+$SquareRoot+" is "+$Rounded);
		System.out.println("The rounded up value of "+$SquareRoot+" is "+$RoundUp);		
		System.out.println("The rounded down value of "+$SquareRoot+" is "+$RoundDown);	
	}

}