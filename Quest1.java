package oneple;
import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int number1;
		int number2;
		int number3;
		int number4;
		
		int maxnumber;
		
		System.out.println("Input number 1: ");
	    number1 = sc.nextInt();
	    System.out.println("Input number 2: ");
	    number2 = sc.nextInt();
	    System.out.println("Input number 3: ");
	    number3 = sc.nextInt();
	    System.out.println("Input number 4: ");
	    number4 = sc.nextInt();
	    
	    maxnumber = number1;
	    
	    if (number2 > maxnumber) {
	    	maxnumber = number2;
	    }
	    
	    if (number3 > maxnumber) {
	    	maxnumber = number3;
	    }
	    
	    if (number4 > maxnumber) {
	    	maxnumber = number4;
	    	
	    }
	    System.out.println("Max number is:" + maxnumber);
	    
	}

}
