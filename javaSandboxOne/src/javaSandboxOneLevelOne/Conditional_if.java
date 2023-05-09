package javaSandboxOneLevelOne;

public class Conditional_if {

	public static void main(String [] args)
	{
		int $Condition = 3;
		
		if ($Condition >= 10) 
			{
				if  ($Condition >= 20)
					{
						if  ($Condition >= 30)
							{
								if  ($Condition >= 40)
									{
										if  ($Condition >= 50)
											{
												if  ($Condition >= 60)
													{
														if  ($Condition >= 70)
															{
																if  ($Condition >= 80)
																{
																	if  ($Condition >= 90)
																		{
																			if  ($Condition >= 100)
																			{
																				System.out.println("The Condition is Greater than 100");
																			}
																		else
																			{
																				System.out.println("The Condition is Greater than 90 and Less than 100");
																			}	
																		}
																	else
																		{
																			System.out.println("The Condition is Greater than 80 and Less than 90");
																		}	
																}
															else
																{
																	System.out.println("The Condition is Greater than 70 and Less than 80");
																}
															}
														else
															{
																System.out.println("The Condition is Greater than 60 and Less than 70");
															}
													}
												else
													{
														System.out.println("The Condition is Greater than 50 and Less than 60");
													}	
											}
										else
											{
												System.out.println("The Condition is Greater than 40 and Less than 50");
											}
									}
								else
									{
										System.out.println("The Condition is Greater than 30 and Less than 40");
									}	
							}
						else
							{
								System.out.println("The Condition is Greater than 20 and Less than 30");
							}
					}
				else
					{
						System.out.println("The Condition is Greater than 10 and Less than 20");
					}
			}
		else
			{
				System.out.println("The Condition is Less than 10");
			}
	}
}
