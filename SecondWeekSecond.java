package joonghyun;
import java.util.*; // * means all,, this utility package needs to be imported for below Scanner

public class SecondWeekSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please input your score");
		Scanner s = new Scanner(System.in); // system input done in Console by keyboard
		int score = s.nextInt(); //for s, user input will be scanned to int (will be converted too)
	
		if(score >= 60) //should only set to get true/false unlike C
		{
			System.out.println("You've passed!");
			
		}
		else
		{
			System.out.println("You've failed.");
	}
		System.out.println("Stay hydrated during summer vacation!");

		s.close(); //similar to unix. Once opened, must be closed. 
}// F11 to debug, F6 to continue the steps 
}
