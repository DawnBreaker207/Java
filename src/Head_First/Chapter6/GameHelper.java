package Head_First.Chapter6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int HORIZONTAL_INCREMENT = 1;
    static final int VERTICAL_INCREMENT = GRID_LENGTH;

    private final int[] grid = new int[GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;

    // Get user input
    public String getUserInput(String prompt) {
	System.out.print(prompt + ": ");
	Scanner scanner = new Scanner(System.in);
	return scanner.nextLine().toLowerCase();
    }

    public ArrayList<String> placeStartup(int startupSize) {
	// Holds index to grid (0-48)
	// Current candidate co-ordinates
	int[] startupCoords = new int[startupSize];
	// Current attempts counter
	int attempts = 0;
	// Flag = found a good location ?
	boolean success = false;

	// nth Startup to place
	startupCount++;
	// Alternate vert & horiz alignment
	int increment = getIncrement();

	// main search loop
	while (!success & attempts++ < MAX_ATTEMPTS) {
	    // Get random staring point
	    int location = random.nextInt(GRID_SIZE);

	    // Create array of proposed coords
	    for (int i = 0; i < startupCoords.length; i++) {
		// Put current location in array
		startupCoords[i] = location;
		// Calculate the next location
		location += increment;
	    }
	    // System.out.println("Trying:" + Arrays.toString(startupCoords));

	    // Startup fits on the grid ?
	    if (startupFits(startupCoords, increment)) {
		// ... and locations aren't taken ?
		success = coordsAvailable(startupCoords);
	    }

	}

	// Coords passed checks, save
	savePositionToGrid(startupCoords);
	ArrayList<String> alphaCells = convertCoordsToAlplaFormat(startupCoords);
	System.out.println("Placed at: " + alphaCells);
	return alphaCells;
    }

    private boolean startupFits(int[] startupCoords, int increment) {
	int finalLocation = startupCoords[startupCoords.length - 1];
	if (increment == HORIZONTAL_INCREMENT) {
	    // Check end is on same row as start
	    return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
	} else {
	    // Check end isn't off the bottom
	    return finalLocation < GRID_SIZE;
	}
    }

    private boolean coordsAvailable(int[] startupCoords) {
	// Check all potential positions
	for (int coord : startupCoords) {
	    // This position already taken
	    if (grid[coord] != 0) {
		// System.out.println("position: " + coord + " already taken.");
		return false;
	    }
	}
	// There were no clashes, yay!
	return true;
    }

    private void savePositionToGrid(int[] startupCoords) {
	for (int index : startupCoords) {
	    // Mark grid position as 'used'
	    grid[index] = 1;

	}
    }

    private ArrayList<String> convertCoordsToAlplaFormat(int[] starupCoords) {
	ArrayList<String> alplaCells = new ArrayList<String>();
	// For each grid coordinate
	for (int index : starupCoords) {
	    // Turn it into an "a0" style
	    String alphaCoords = getAlplaCoordsFromIndex(index);
	    // Add to the list
	    alplaCells.add(alphaCoords);
	}

	// Return the "a0"-style coords
	return alplaCells;

    }

    private String getAlplaCoordsFromIndex(int index) {
	// Get row value
	int row = calcRowFromIndex(index);
	// Get numeric column value
	int column = index % GRID_LENGTH;
	// Convert to letter
	String letter = ALPHABET.substring(column, column + 1);
	return letter + row;
    }

    private int calcRowFromIndex(int index) {
	return index / GRID_LENGTH;
    }

    private int getIncrement() {
	// If EVEN Startup
	if (startupCount % 2 == 0) {
	    // Place horizontally
	    return HORIZONTAL_INCREMENT;
	    // Else ODD
	} else {
	    // Place vertically
	    return VERTICAL_INCREMENT;
	}
    }
}
