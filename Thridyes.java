package introjava;

import java.util.*;

public class Thridyes {

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		System.out.print("Please input an alphabet");
		char ch = s.next().charAt(0);
	
		if(ch >= 'A' && ch<='Z') // saved as number
		{
			ch = (char)(ch - 'A' + 'a'); // recognized as 4 byte integer, but ch is 2 byte
			System.out.println("What you put in is an upper letter. Its lower letter is " + ch + "");
		}
		else
		{
			if(ch >= 'a' && ch<='z')
			{
				ch = (char)(ch - 'a' + 'A');
				System.out.println("What you put in is a lower letter. Its upper letter is " + ch + "");
	// always check the double quote if there is an additional one.
			}
			else
			{
				System.out.println("An alphabet must be put in.");
	
			}
		}
		s.close();
	}
}
//if and return is used, else is not needed. s.close(); should be used before though. 