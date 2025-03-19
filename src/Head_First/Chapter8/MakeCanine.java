package Head_First.Chapter8;

class Animals {

}

abstract class Canine extends Animals {
    public void roam() {

    }
}

class Lion extends Canine {

}

public class MakeCanine {
    public void go() {
	Canine c;
	c = new Lion();
//	c = new Canine();
	c.roam();
    }
}