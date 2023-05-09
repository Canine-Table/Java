/**
 * 
 */
package javaSandboxOneLevelOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** @author Table **/
@SuppressWarnings({"serial"})
public class SerializationClass 
	{
		SerializationClass()
			{
				Users user = new Users();
		 		user.name = "John Doe";
		 		user.password = "John123";
				try
				{
					user.outName();
					FileOutputStream outFile = new FileOutputStream("src/javaSandboxOneLevelOne/File.ser");
					ObjectOutputStream outStream = new ObjectOutputStream(outFile);
					outStream.writeObject(user);
					outFile.close();
					
					System.out.println("Object Info Saved");
					
				} catch(FileNotFoundException e)
					{
						e.getStackTrace();
					} catch(IOException e) 
						{
							e.getStackTrace();
						}
			}
		
		private class Users implements Serializable
			{
				
				String name;
				String password;
								
				Users()
					{
					
					}
				public void outName()
					{
						System.out.println("Username: "+name);
						System.out.println("Password: "+password);
					}
			}
		
		public static void main(String[] args)
			{
				new SerializationClass();
			}
			
	}