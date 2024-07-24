package oneple;

import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter apartment number:");
        int apartmentNumber = scanner.nextInt();
        
        
        int totalApartments = 180;

        
        if (apartmentNumber > totalApartments || apartmentNumber < 1) {
            System.out.println("There is no such apartment in the building");
        } else {
           
            int entrance = (apartmentNumber - 1) / 36 + 1;
            
            int apartmentInEntrance = (apartmentNumber - 1) % 36 + 1; 
            
            int floor = (apartmentInEntrance - 1) / 4 + 1;           
            
            System.out.println(" aprtament " + apartmentNumber + " located in the entrence " + entrance + " on the floor " + floor);
        }
        


	}
}