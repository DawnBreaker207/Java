package Chapter9;

class Animal {
    private String name;

    public String getName() {
	return name;
    }

    public Animal(String theName) {
	name = theName;
    }

    public Animal() {

    }
}

class Duck extends Animal {
    int size;

//    Constructor

    public Duck(int duckSize) {
//	Superclass constructor
	super();
	System.out.println("Quack");
	size = duckSize;
	System.out.println("Size is " + size);
    }

//    Overloaded
    public Duck() {
	System.out.println("Quack");
    }

//    Method
    public void setSize(int newSize) {
	size = newSize;
    }
}

class Hippo extends Animal {
    public Hippo(String name) {
	super(name);
    }
}

public class UseDuck {

    public static void main(String[] args) {
	Duck d = new Duck();
//	Duck d = new Duck(42);
//	d.setSize(42);
	Hippo h = new Hippo("Lmao");
	System.out.println(h.getName());

    }

}
