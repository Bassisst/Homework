package oneple;

import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int sideA;
		int sideB;
		int sideC;
		
		System.out.println("Input Side A: ");
	    sideA = sc.nextInt();
	    System.out.println("Input Side B: ");
	    sideB = sc.nextInt();
	    System.out.println("Input Side C: ");
	    sideC = sc.nextInt();
	    
	    
	    if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
	    	System.out.println( "A triangle with such sides exists.");
	    }else {
	    	System.out.println("A triangle with such sides does not exist.");
	    }
	    
		
		
        

	}

}
