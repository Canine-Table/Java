package javaSandboxOneLevelOne;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/** @author Table **/

public class AudioPlayerClass 
	{
		@SuppressWarnings("unused")
		public static void main(String[] args)
			{

				try 
					{
						String $Responce = "";
						int $Time = 0;
						String $Path = "src/javaSandboxOneLevelOne/Juice WRLD - Lean Wit Me (Official Music Video).wav";
						File $File = new File($Path);
						try (Scanner $Input = new Scanner(System.in)) 
							{
								AudioInputStream $AudioStream = AudioSystem.getAudioInputStream($File);
								Clip $Clip = AudioSystem.getClip();
								$Clip.open($AudioStream);
								while(!$Responce.equals("Q"))
									{
										System.out.println("\n\t(P) Play\n\t(Q) Quit\n\t(R) Reset\n\t(S) Stop\n\t(L) Loop\n");
										System.out.print("\n\tInput: ");
										$Responce = $Input.next();
										$Responce = $Responce.toUpperCase();
										switch($Responce)
											{
												case ("P"): $Clip.start();
													break;
												case ("S"): $Clip.stop();
													break;
												case "R": $Clip.setMicrosecondPosition(0);
													break;
												case "L": $Clip.loop(1);
													break;
												default: System.out.print("\n\tInvalid Choice\n");
											}
									}
								$Clip.close();
							}
						
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) 
						{
							e.printStackTrace();
						}
			}
	}