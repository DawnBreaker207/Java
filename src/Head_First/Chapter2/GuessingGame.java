package Head_First.Chapter2;

class Player {
    int number;

    void guess() {
	number =(int) (Math.random() * 10);
	System.out.println("You guess number is");
    }
}

class GuessGame {
    // Initialize instance variables of Player object
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
	// Create three Player objects and assign to the three Player instance variable
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();

	// Declare three variables to hold the three guesses the Player make
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;

	// Declare three variables to hold a true or false based on the player answer
	boolean p1isRight = false;
	boolean p2isRight = false;
	boolean p3isRight = false;

	// Make a 'target' number that the players have to guess
	int targetNumber = (int) (Math.random() * 10);
	System.out.println("I'm thinking of a number between 0 and 9... ");

	while (true) {
	    System.out.println("Number to guess is " + targetNumber);
	    // Call each player guess() method
	    p1.guess();
	    p2.guess();
	    p3.guess();

	    // Get each player guess by accessing the number variable of each player
	    guessp1 = p1.number;
	    System.out.println("Player one guessed " + guessp1);

	    guessp2 = p2.number;
	    System.out.println("Player one guessed " + guessp2);

	    guessp3 = p3.number;
	    System.out.println("Player one guessed " + guessp3);

	    // Check each player guess to see if it matches the target number. If a player
	    // is right, then set that player's variable to be true
	    if (guessp1 == targetNumber) {
		p1isRight = true;
	    }
	    if (guessp2 == targetNumber) {
		p2isRight = true;
	    }
	    if (guessp3 == targetNumber) {
		p3isRight = true;
	    }

	    // If check if one of 3 player was right
	    if (p1isRight || p2isRight || p3isRight) {
		System.out.println("We have a winner!");
		System.out.println("Player one got it right? " + p1isRight);
		System.out.println("Player two got it right? " + p2isRight);
		System.out.println("Player three got it right? " + p2isRight);
		System.out.println("Game is over.");
		break;
	    } else {
		// Otherwise, stay in the loop and ask the players for another guess
		System.out.println("Plaers will have to try again");
	    }
	}
    }

}

class GameLauncher {
    void play() {
	GuessGame p = new GuessGame();
	p.startGame();
    }
}

public class GuessingGame {

    public static void main(String[] args) {
	GameLauncher launch = new GameLauncher();
	launch.play();
    }

}
