package javaSandboxOneLevelOne;

public class PrintfClass {
	/**	printf() = an optional method to control, dormat, and display text to the console window.
	 * 				two arguments - formats strinf + (object/variale/value)
	 * 				% [flags] [precision] [width] [conversion characters]
	 * 
	 *  %c character
	 *  %d decimal (integer) number (base 10)
	 *  %e exponential floating-point number
	 *  %f floating-point number	
	 *  %i integer (base 10)
	 *  %o octal number (base 8)
	 *	%s String
	 *	%u unsigned decimal (integer) number
	 *	%x number in hexadecimal (base 16)
	 *	%t formats date/time
	 *	%% print a percent sign
	 *
	 *  T%  date time
	 *  t%  date time
	 *	H%  hour
	 *  M%  minute
	 *	S%  second
	 *	L%  milliseconds
	 *	M%  millisecond
	 *  p%  am / pm
	 *  z%  time offset 
	 *  A%	prints out the full day of the week.
	 *  d%	formats a two-digit day of the month.
	 *  B%	Prints the full month name.
	 *  m%	formats a two-digit month.
	 *  Y%	outputs the year in four digits.
	 *  y%	outputs the last two digits of the year.
	 *
	 *	\% print a percent sign
	 *	\b backspace
	 *	\f next line first character starts to the right of current line last character
	 *	\n newline
	 *	\r carriage return
	 *	\t tab
	 *	\\ backslash 
	 */
	/**
	 * @author Table
	 *	// System.out.printf(string);
	 *	// System.out.printf(format, arguments);
	 *	// System.out.printf(locale, format, arguments);
	 *
	 *	[width] 	minimum number of characters to be written as output
	 *	
	 *	[precision]
	 *	set number of digits of precision when outputting floating-point values
	 *	System.out.printf("%n%n%tYou have this much money %.22f"m nyDouble) 
	 *
	 * 	[flags]
	 *  - :	left-justify
	 *  + : outputs a plus (+) or a minus (-) sign for a numeric value
	 *  0 : numeric values are zero-padded 
	 *  , : comma grouping seperator if numers => 1000
	 */
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.printf("\n\n\tHello %d Printf: %d",123,22);
			double myDouble = 43566567.4393234334;
			System.out.printf("%n%4s %,.2f ","\tYou have this much money: ",myDouble);
		}

	}


