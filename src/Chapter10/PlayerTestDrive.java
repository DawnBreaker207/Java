package Chapter10;
class Foof {
    final int size = 3;
    final int whuffie;
    
    Foof(){
////	Can change whuffile if use final
//	whuffile = 42;
    }
    
//    Can not change x if use final
    void doStuff(final int x) {
	
    }
    
    void doMore() {
//	Can not change z if use final
	final int z= 7;
	
    }
    
}

class Poof{
//    Can not be overridden
    final void canlcWhuffie() {
	
    }
}

final class MyMostPerfectClass {
//    Can not be extends
}

class ConstanctInit1{
    final static int x;
//    Static initializer
    static {
	x = 42;
    }
}

class Player{
    static int playerCount = 0;
    private String name;
    public Player(String n) {
	name = n;
	playerCount++;
    }
}
public class PlayerTestDrive {

    public static void main(String[] args) {
	System.out.println(Player.playerCount);
	Player one = new Player("Tiger Woods");
	System.out.println(Player.playerCount);
    }

}
