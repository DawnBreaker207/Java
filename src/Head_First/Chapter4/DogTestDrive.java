package Head_First.Chapter4;

class Dog {
    private int size;
    private String name;

    public int getSize() {
	return size;
    }

    public String getName() {
	return name;
    }

    public void setSize(int s) {
	size = s;
    }

    public void setName(String n) {
	name = n;
    }

    void bark(int numOfBarks) {
	while (numOfBarks > 0) {
	    if (size > 60) {
		System.out.println("Wooof! Wooof!");
	    } else if (size > 14) {
		System.out.println("Ruff! Ruff!");
	    } else {
		System.out.println("Yip! Yip!");
	    }
	    numOfBarks = numOfBarks - 1;
	}
    }

}

public class DogTestDrive {

    public static void main(String[] args) {
//	Dog one = new Dog();
//	one.setSize(70);
//	Dog two = new Dog();
//	two.setSize(8);
//	Dog three = new Dog();
//	three.setSize(35);
//
//	one.bark(2);
//	two.bark(3);
//	three.bark(5);
//	System.out.println("Yip! Yip! " + one.getSize());

	Dog[] pets;
	pets = new Dog[7];

	pets[0] = new Dog();
	pets[1] = new Dog();
	pets[2] = new Dog();
	pets[0].setSize(30);
	int x = pets[0].getSize();
	System.out.println(x);
	pets[1].setSize(8);

	System.out.println("Dog size is " + pets[2].getSize());
	System.out.println("Dog name is " + pets[2].getName());

    }

}
