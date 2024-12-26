class SimpleStartUp {
    int[] locationCells;
    int numOfHits = 0;

    String checkYouSelf(int guest) {


        String result = "miss";

        for (int cell : locationCells) {
            if (guest == cell) {
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


    ;

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }

}

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartUp dot = new SimpleStartUp();

        int[] locations = {2, 3, 4};

        dot.setLocationCells(locations);


        int userGuess = 2;


        String result = dot.checkYouSelf(userGuess);

        String testResult = "Failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}

