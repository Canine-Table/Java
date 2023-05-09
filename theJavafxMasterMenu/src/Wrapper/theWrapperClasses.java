package Wrapper;
public class theWrapperClasses {
	public static void main(String[] args) {
		String header[] = {"Relative","Size","Minimum","Maximum"};
		String wrapper[] = {"Character","Byte","Short","Integer","Long","Float","Double"};
		Long min[] = {-128L,-32768L,-2147483648L,-9223372036854775808L};
		Long max[] = {127L,32767L,2147483647L,9223372036854775807L};
		String size[] = {"8 bits","16 bits","32 bits","64 bits"};
		String others[] = {"7 decimal places","16 decimal places","1 decimal place","ASCII 255","ASCII 0"};
		String examples = "Example: ";	
		Character wCharacter = 123;
		Byte wByte = 120;
		Short wShort = 32276;
		Integer wInteger = 423449843;
		Long wLong = 922337204553775807L;
		Float wFloat = 3.1415926F;
		Double wDouble =  3.1415926535897932;
System.out.println("\n\tJava Primitive Data Types Information");
System.out.printf("%n\t%-30s%-30s%-30s%-30s%n"
				+ "%n\t%-30s%-30s%-30s%-30s%-10s%c"
				+ "%n\t%-30s%-30s%-30d%-30d%-10s%d"
				+ "%n\t%-30s%-30s%-30d%-30d%-10s%d"
				+ "%n\t%-30s%-30s%-30d%-30d%-10s%d"
				+ "%n\t%-30s%-30s%-30d%-30d%-10s%d"
				+ "%n\t%-30s%-30s%-30s%-30s%-10s%.7f"
				+ "%n\t%-30s%-30s%-30s%-30s%-10s%.16f%n%n",
		header[0],header[1],header[2],header[3],
		wrapper[0],size[1],others[4],others[3],examples,wCharacter,
		wrapper[1],size[0],min[0],max[0],examples,wByte,
		wrapper[2],size[1],min[1],max[1],examples,wShort,
		wrapper[3],size[2],min[2],max[2],examples,wInteger,
		wrapper[4],size[3],min[3],max[3],examples,wLong,
		wrapper[5],size[2],others[2],others[0],examples,wFloat,
		wrapper[6],size[3],others[2],others[1],examples,wDouble);
System.out.println("\tProgram by  Perso"); } }