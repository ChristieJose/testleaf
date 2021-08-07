package week.day1;

public class Fibonaccinumber {
	public static void main(String[] args) {
		int firstNum=0,secondNum=1,sum,i,count=8;    
		 System.out.print(firstNum+" "+ secondNum);   
		    
		 for(i=2;i<count;++i)    
		 {    
		  sum=firstNum+secondNum;    
		  System.out.print(" "+sum);    
		  firstNum=secondNum;    
		  secondNum=sum;    
		}
			
	}

}
