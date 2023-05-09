package javaSandboxOneLevelOne;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** @author Table **/

public class FileClass
	{
	static CharSequence ASCII()
			{	
				String a ="";
				System.out.print("\n\n\n\n\n\n\n");
				System.out.print("\t	            _,addba,                                                         \n");
				System.out.print("\t	        _,adP''\\  'Y,                       _____                           \n");
				System.out.print("\t	      ,P'  d'Y, \\  8                  ,adP'''''''Yba,_                      \n");
				System.out.print("\t	    ,d' /,d' `Yb, ,P'              ,adP''           `''Yba,                  \n");
				System.out.print("\t	    d'   d'    `'''         _,aadP'''''''Ya,             `'Ya,_              \n");
				System.out.print("\t	    8  | 8              _,adP''                              `'Ya,           \n");
				System.out.print("\t	    8    I,           ,dP'           __              'baa,       'Yb,        \n");
				System.out.print("\t	    I,   Ya         ,db___           `'Yb,      a       `'         `'b,      \n");
				System.out.print("\t	    `Y, \\ Y,      ,d8888888baa8a,_      `'      `'b,                 `'b,   \n");
				System.out.print("\t	     `Ya, `b,    d8888888888888888b,               'ba,                `8,   \n");
				System.out.print("\t	       'Ya,`b  ,d8888888888888888888,   d,           `'Ya,_             `Y,  \n");
				System.out.print("\t	         `Ybd8d8888888888888888888888b, `'Ya,            `''Yba,         `8, \n");
				System.out.print("\t	            'Y8888888888888888888888888,   `Yb,               `'Ya        `b \n");
				System.out.print("\t	             d8888888888888888888888888b,    `''            ,    'b,       8,\n");
				System.out.print("\t	             888888888888888888888888888b,                  b      'b      `b\n");
				System.out.print("\t	             8888888888888888888888888888b    b,_           8       '       8\n");
				System.out.print("\t	             I8888888888888888888888888888,    `'Yb,_       `b,             8\n");
				System.out.print("\t	              Y888888888888888888888888888I        `Yb,       8,            8\n");
				System.out.print("\t	               `Y8888888888888888888888888(          `8,       'b     a    ,P\n");
				System.out.print("\t	                 '8888''Y88888888888888888I           `b,       `b    8    d'\n");
				System.out.print("\t	                   'Y8b,  'Y888PPY8888888P'            `8,       P    8    8 \n");
				System.out.print("\t	                       `b   ''  __ `'Y88P'    b,        `Y       '    8    8 \n");
				System.out.print("\t	                      ''|      =''Y'   d'     `b,                     8    8 \n");
				System.out.print("\t	                       /         '' |  I       b             ,       ,P   ,P \n");
				System.out.print("\t	                      (          _,'  d'       Y,           ,P       '    d' \n");
				System.out.print("\t	                       |              I        `b,          d'            8  \n");
				System.out.print("\t	                       |              I          '         d,d'           8  \n");
				System.out.print("\t	                       |          ;   `b                  dP'          __,8_ \n");
				System.out.print("\t	                       |          |    `b                d'     _,,add8888888\n");
				System.out.print("\t	                       ',       ,'      `b              d' _,ad88888888888888\n");
				System.out.print("\t	                         \\,__,a'          ',          _,add888888888888888888\n");
				System.out.print("\t	                        _,aa888b           I       ,ad88888888888888888888888\n");
				System.out.print("\t	                    _,ad88888888a___,,,gggd8,   ,ad88888888888888888888888888\n");
				System.out.print("\t	                 ,ad888888888888b88PP''''  Y  ,dd8888888888888888888888888888\n");
				System.out.print("\t	              ,ad8888888888888888'         `bd8888888888888888888888888888888\n");
				System.out.print("\t	            ,d88888888888888888P'         ,d888888888888888888888888888888888\n");
				System.out.print("\t	          ,d888888888888888888'         ,d88888888888888888888888888888888888\n");
				System.out.print("\t	        ,d8888888888888888888P        ,d8888888888888888888888888888888888888\n");
				System.out.print("\t	      ,d888888888888888888888b,     ,d888888888888888888888888888888888888888\n");
				System.out.print("\t	     ,8888888888888888888888888888=888888888888888888888888888888888888888888\n");
				System.out.print("\t	    d888888888888888888888888888=88888888888888888888888888888888888888888888\n");
				System.out.print("\t	   d88888888888888888888888888=8888888888888888888888888888888888888888888888\n");
				System.out.print("\t	  d8888888888888888888888888=888888888888888888888888888888888888888888888888\n");
				System.out.print("\t	 d888888888888888888888888=88888888888888888888888888888888888888888888888888\n");
				System.out.print("\t        ,888888888888888888888888=888888888888888888888888888888888888888888888888888\n");
				System.out.print("\t        d8888888888888888888888=88888888888888888888888888888888888888888888888888888\n");
				System.out.print("\t       ,8888888888888888888888=888888888888888888888888888888888888888888888888888888\n");
				System.out.print("\t       d888888888888888888888=88888888888888888888888888888888888888888  Normand   88\n");
				System.out.print("\t       888888888888888888888=888888888888888888888888888888888888888888  Veilleux  88\n");
				System.out.print("\t       888888888888888888888=88888888888888888888888888888888888888888888888888888888\n");
				return a;
			}
	
		public static void main(String[] args)
			{
				String $Path = "src/javaSandboxOneLevelOne/File.txt";
				File $File = new File($Path);
				String $Type = null;
				if (!$File.exists())
					{
						System.out.println("\n\tThe file or directory "+$File+" does not exsist.");
						try
							{
								$File.createNewFile();
							} catch (IOException e)
								{
									e.getStackTrace();
								} finally 
									{
										System.out.println("\n\tCreating the file "+$File.getName()+".");
									}
					}
				if ($File.isDirectory())
					{
						$Type = "Directories";
					}
				else if ($File.isFile())
					{
						$Type = "Files";
					}

				System.out.println("\n\t"+$Type+" Path Information\n\t----------------------");
				System.out.println("\n\t"+$Type+" absolute path: ("+$File.getAbsolutePath()+")");
				System.out.println("\t"+$Type+" relitive path: ("+$File.getPath()+")");
				System.out.println("\tParent: ("+$File.getParent()+")");
				System.out.println("\tName: ("+$File.getName()+")\n");
				
				System.out.println("\n\t"+$Type+" Attributes\n\t----------------");
				System.out.println("\n\tHidden file = "+$File.isHidden());
				System.out.println("\tWritable file = "+$File.canWrite());
				System.out.println("\tReadable file = "+$File.canRead());
				System.out.println("\tExecutable file = "+$File.canExecute()+"\n\n");
				System.out.println("\n\t"+$Type+" HashCode\n\t--------------");
				System.out.println("\tHashcode: ["+$File.hashCode()+"]");
				
				try
					{
						FileWriter $Write = new FileWriter($Path);
						for (int $i=1;$i<=5;$i++)
							{
								$Write.write("\n\t("+$i+") Java is the worlds best programming language!\n");
							}
						$Write.append(ASCII());
						$Write.close();
					} catch (IOException e)
						{
							e.getStackTrace();
						} finally
							{
								System.out.println("\n\tWriting to the "+$Type+" ("+$File.getName()+")");
							}
				try
					{
						FileReader $Read = new FileReader($Path);
						int $Data = $Read.read();
			 			while ($Data != -1)
							{
								System.out.print((char)$Data);
								$Data = $Read.read();
							}
						$Read.close();
					} catch(IOException e)
						{
							e.getStackTrace();
						} finally
							{
								System.out.println("\n\tFinished reading file.");
							}
				
			}
	}
