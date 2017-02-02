package myPack;

import java.util.Scanner;

public class Ses7Asnment2 {

	public static void main(String[] args) 
	{
		Substring ss = new Substring();
		ss.SubStringFinder();
	}

}

class Substring
{
	public void SubStringFinder()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string value : ");
	String s1 = sc.nextLine();
	System.out.println("Enter a substring value to be searched from previous string : ");
	String s2 = sc.nextLine();	
	boolean b = s1.contains(s2);
	System.out.println("'"+s2+ "':: is present in ::'"+s1+"' ? "+b);
	
	}
}