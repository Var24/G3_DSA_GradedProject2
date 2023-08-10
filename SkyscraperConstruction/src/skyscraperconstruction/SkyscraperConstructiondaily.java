package skyscraperconstruction;

import java.util.Scanner;

public class SkyscraperConstructiondaily {
	private int totalFloors;
    private int[] floorSizes;

    public void startConstruction() {
    	// Get user inputs for total number of floors and floor sizes
        getUserInputs();
        // Assemble the skyscraper based on user inputs
        assembleSkyscraper(totalFloors, floorSizes);
    }

    private void getUserInputs() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the total number of floors
        
        System.out.print("Enter the total number of floors in the building: ");
        totalFloors = scanner.nextInt();
        floorSizes = new int[totalFloors];

        for (int i = 0; i < totalFloors; i++) {
        	// Prompt the user to enter the floor sizes for each day
            System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
            floorSizes[i] = scanner.nextInt();
        }

        scanner.close();
    }

    private void assembleSkyscraper(int totalFloors, int[] floorSizes) {
    	// Iterate through each day of construction
    	for (int i = 0; i < totalFloors; i++) {
            StringBuilder assemblyOrder = new StringBuilder();
            int currentSize = floorSizes[i];
         // Compare the current floor size with the sizes of subsequent days
            
            for (int j = i + 1; j < totalFloors; j++) {
                if (floorSizes[j] > currentSize) {
                	// Add larger floor sizes to the assembly order
                	assemblyOrder.insert(0, floorSizes[j] + " ");
                }
            }
            
         // Print the construction order for the current day
            System.out.println("Day " + (i + 1) + ": " + assemblyOrder.toString());
        }
    }

}
