package Chapter7;

public class Animal {
    String picture;
    boolean food;
    int hunger;
    String boundaries;
    String location;

    void makeNoise() {

    }

    void eat() {

    }

    void sleep() {

    }

    class Canine extends Animal {
	void roam() {

	}
	void eat() {
	    super.eat();
	}
    }

    public static void main(String[] args) {
	Animal Lion = new Animal();
	Lion.makeNoise();
	Lion.eat();

	Animal Hippo = new Animal();
	Hippo.makeNoise();
	Hippo.eat();

	Animal Tiger = new Animal();
	Tiger.makeNoise();
	Tiger.eat();

	Animal Dog = new Animal();
	Dog.makeNoise();
	Dog.eat();

	Animal Cat = new Animal();
	Cat.makeNoise();
	Cat.eat();

	Animal Wolf = new Animal();
	Wolf.makeNoise();
	Wolf.eat();
    }
}
