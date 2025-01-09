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

    public static void main(String[] args) {

	Animal Lion = new Canine();
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
	Dog.makeNoise();
	Dog.eat();

	Animal Cat = new Animal();
	Cat.makeNoise();
	Cat.eat();

	Animal Wolf = new Animal();
	Wolf.makeNoise();
	Wolf.eat();

	Vet vet = new Vet();
	vet.giveShot(Lion);
	vet.giveShot(Cat);

	Animal[] animals = new Animal[5];
	animals[0] = new Dog();
	animals[1] = new Cat();
	animals[2] = new Wolf();

	for (Animal animal : animals) {
	    animal.eat();
	    animal.sleep();

	}
    }
}

class Vet {
    public void giveShot(Animal a) {
	a.makeNoise();
    }
}

class Canine extends Animal {
    void roam() {
    }

    void eat() {
	// Overide
	super.eat();
    }

}

class Dog extends Animal {
    // Overloaded
    void makeNoise() {

    }

    int makeNoise(int a, int b) {
	return a + b;
    }
}

class Cat extends Animal {

}

class Wolf extends Animal {
}
