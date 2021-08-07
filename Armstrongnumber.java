package week.day1;

public class Armstrongnumber {
	
public static void main(String[] args) {
            int number = 153, checkNumber, remainder, result = 0;
            checkNumber = number;
            while (checkNumber != 0)
	        {
	            remainder = checkNumber % 10;
	            result += Math.pow(remainder, 3);
	            checkNumber = (checkNumber/10);
	        }
            if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}