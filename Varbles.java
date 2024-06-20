/*
*The general rules for naming variables are:

-Names can contain letters, digits, underscores, and dollar signs
-Names must begin with a letter
-Names should start with a lowercase letter, and cannot contain whitespace
-Names can also begin with $ and _ (but we will not use it in this tutorial)
-Names are case-sensitive ("myVar" and "myvar" are different variables)
-Reserved words (like Java keywords, such as int or boolean) cannot be used as names
 My Programming For Datascience Course Work
*/


public class Varbles{
	public static void main(String[] Args){
		String unit= "BSD 3203";
		String description="Programming for Data Science";
		String firstName="Bryian";
		String middleName="Owuor";
		String lastName="Ochieng";
		float ass1=4.0f;
		float ass2=3.0f;
		float ass3=9.0f;
		float CAT1=13.0f;
		float CAT2=15.0f;
		float courseWork=44.0f;
		
		System.out.println("_____________________________________________________________________________________________");
		System.out.println("|   Unit   |          Description         | Ass1 | Ass2 | Ass3 | CAT1 | CAT2 | Course Work  |");
		System.out.println("| "+unit+" | "+description+" | "+ass1+"  | "+ass2+"  | "+ass3+"  | "+CAT1+" | "+CAT2+" |     "+courseWork+"     | ");
		System.out.println("---------------------------------------------------------------------------------------------");
	}
}