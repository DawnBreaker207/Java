package Head_First.Chapter6;

import java.util.ArrayList;
import java.util.Scanner;


class StartUp {
    private ArrayList<String> locationCells;
    private String name; 
    
    public void setLocationCells(ArrayList<String> loc) {
	locationCells = loc;
    }

    public void setName(String n) {
	name = n;
    }
    
    String checkYourSelf(String userInput) {
	String result = "miss";
	int index = locationCells.indexOf(userInput);

	if (index >= 0) {
	    locationCells.remove(index);
	    
	    if (locationCells.isEmpty()) {
		result = "kill";
		System.out.println("Ouch! You sunk" + name + " : ( " );
	    } else {
		result = "hit";
	    }
	}
	return result;

    }
}

