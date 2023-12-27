package introjava;

public class Seventh {
	static int rangeSum(int startInFunction, int endInFunction)
	{
			int sum = 0;
			for(;startInFunction <= endInFunction; startInFunction++)
			{
					sum += startInFunction;
					
			}
		return sum;
		

	}
	public static void main(String[] args)
	{
		int start = 1;
		int end = 100;
				
		int sum = rangeSum(start,end);
		System.out.println("Sum from " + start + " to " + end + " is " + sum);
				
	}
}
