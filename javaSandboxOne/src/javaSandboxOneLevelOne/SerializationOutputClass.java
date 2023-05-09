package javaSandboxOneLevelOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

/** @author Table **/
@SuppressWarnings("unused")
public class SerializationOutputClass implements Serializable
		{
			/**
	 * 
	 */
			private static final long serialVersionUID = 1L;
			String username;
			transient String password;
			
			SerializationOutputClass()
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
							SerializationInputClass user = null;
							FileInputStream inFile = new FileInputStream("src/javaSandboxOneLevelOne/outFile.ser");
							ObjectInputStream inStream = new ObjectInputStream(inFile);
							user = (SerializationInputClass) inStream.readObject();
							inFile.close();
							inStream.close();							
							System.out.println("Username: "+user.username);
							System.out.println("Password: "+user.password);
							user.writeOut();
							long serialVersionUID = ObjectStreamClass.lookup(SerializationInputClass.class).getSerialVersionUID();						
							System.out.println("Serial Version UID: "+serialVersionUID);
						} catch(ClassNotFoundException e)
							{
								e.getStackTrace();
							} catch(IOException e)
								{
								e.getStackTrace();
								}
				}
		}