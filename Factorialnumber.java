package week.day1;

public class Factorialnumber {
	public static void main(String[] args) {
		int i,fact=1;
		int number=5;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		
	    }
		System.out.println("the factorial of given number is:" + fact);
}
}
