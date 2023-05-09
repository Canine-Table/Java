package javaSandboxOneLevelOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

/** @author Table **/

public class SerializationInputClass implements Serializable
		{
			private static final long serialVersionUID = 1L;
			String username;
			transient String password;
			
			SerializationInputClass()
				{

				}
			
			public void writeOut()
				{
					System.out.printf("%10s%n%10s%n",
									"Username: "+username,
									"Password: "+password);
				}
			
			public static void main(String[] args)
				{
					try 
						{
							SerializationInputClass user = new SerializationInputClass();
							user.username = "Johnny";
							user.password = "123";
							FileOutputStream outFile = new FileOutputStream("src/javaSandboxOneLevelOne/outFile.ser");
							ObjectOutputStream outStream = new ObjectOutputStream(outFile);
							outStream.writeObject(user);
							outFile.close();
							outStream.close();
							System.out.println("Information Saved!");
							long serialVersionUID = ObjectStreamClass.lookup(SerializationInputClass.class).getSerialVersionUID();						
							System.out.println("Serial Version UID: "+serialVersionUID);
						} catch(FileNotFoundException e)
							{
								e.getStackTrace();
							} catch(IOException e)
								{
								e.getStackTrace();
								}
				}
		}