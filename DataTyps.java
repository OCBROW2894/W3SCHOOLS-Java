/* 
*DataType	Size	Description
-byte	  1 byte	Stores whole numbers from -128 to 127
-short	  2 bytes	Stores whole numbers from -32,768 to 32,767
-int	  4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
-long	  8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
-float    4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
-double	  8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
-boolean  1 bit	    Stores true or false values
-char	  2 bytes	Stores a single character/letter or ASCII values

*/
public class DataTyps{

	public static void main(String[] Args){
		String unitCode = "BSD 3205";
		String description= "EMBEDED SYSTEMS";
		int creditHours= 3;
		char grade='A';
		float points= 12.0f;
		
		System.out.println("_______________________________________________________________");
		System.out.println("| UNIT CODE |   DESCRIPTION   | CREDIT HOURS | GRADE | POINTS |");
		System.out.println("| " + unitCode + "  | " + description + " |      " + creditHours + "       |   " + grade + "   |  " + points + "  |");
		System.out.println("---------------------------------------------------------------");
	}
}