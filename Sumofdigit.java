package week.day1;

public class Sumofdigit {
	
	public static void main(String args[])  
	{  
	int number = 387;
	int digit; 
	int sum = 0;   
	while(number > 0)  
	{  
	digit = (number % 10);  
	sum = sum + digit;  
	number = (number / 10);  
	}  
	System.out.println("Sum of Digits: " + sum);  
	}  
	}  

