package Chapter5;

import java.util.Iterator;

class Game {

}

class Startup {
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

public class BattleShip {

    public static void main(String[] args) {
	Startup dot = new Startup();

	int[] locations = { 2, 3, 4 };
	dot.setLocationCells(locations);

	int userGuess = 3;
	String result = dot.checkYourSelf(userGuess);

	String testResult = "failed";
	if (result.equals("hit")) {
	    testResult = "passed";
	}

	System.out.println(testResult);
    }

}
