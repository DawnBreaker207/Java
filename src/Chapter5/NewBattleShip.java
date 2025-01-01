package Chapter5;
import java.util.Scanner;

class GameHelper {
    public int getUserInput(String prompt) {
	System.out.print(prompt + ": ");
	Scanner scanner = new Scanner(System.in);
	return scanner.nextInt();
    }
}

class SimpleStartup {
    int[] locationCells;
    int numOfHits = 0;

    String checkYourSelf(int guess) {
	String result = "miss";
	for (int cell : locationCells) {
	    if (guess == cell) {
		result = "hit";
		numOfHits++;
		break;
	    }
	}
	if (numOfHits == locationCells.length) {
	    result = "kill";
	}
	System.out.println(result);
	return result;

    }

    void setLocationCells(int[] location) {
	locationCells = location;
    }
}


public class NewBattleShip {

    public static void main(String[] args) {
	
	int numOfGuesses = 0;
	GameHelper helper = new GameHelper();
	SimpleStartup doc = new SimpleStartup();

	int randomNum = (int) (Math.random() * 5);
	int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
	doc.setLocationCells(locations);
	boolean isAlive = true;

	while (isAlive) {
	    int guess = helper.getUserInput("enter a number");

	    String result = doc.checkYourSelf(guess);
	    numOfGuesses++;
	    if (result.equals("kill")) {
		isAlive = false;
		System.out.println("You took " + numOfGuesses + " guesses");
	    }
	}
    }

    
}
