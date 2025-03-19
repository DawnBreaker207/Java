package Head_First.Chapter8;

import java.util.ArrayList;

class Animal {
    public void roar() {
	System.out.println("Roar");
    }
}

class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
	if (nextIndex < animals.length) {
	    animals[nextIndex] = a;
	    System.out.println("Animal added at " + nextIndex);
	    nextIndex++;
	}
    }

}

class Dog extends Animal {
    public void roar() {
	super.roar();
	System.out.println("Bark");
    }
}

class Cat extends Animal {

}

public class AnimalTestDrive {
    public static void main(String[] args) {
	MyAnimalList list = new MyAnimalList();
	Dog dog = new Dog();
	Cat cat = new Cat();
	Cat c = new Cat();
	dog.roar();
	System.out.println(c.hashCode());
	System.out.println(c.getClass());
	System.out.println(c.toString());
	if (dog.equals(cat)) {
	    System.out.println("true");
	} else {
	    System.out.println("false");
	}

	list.add(dog);
	list.add(cat);
//	Good
	ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
	Dog aDog = new Dog();
	myDogArrayList.add(aDog);
	Dog d = myDogArrayList.get(0);

////	Bad
//	ArrayList<Object> myDogArrayList = new ArrayList<Object>();
//	Dog aDog = new Dog();
//	myDogArrayList.add(aDog);
//	Dog d = myDogArrayList.get(0);
    }

//    Bad
//    public void go() {
//	Dog aDog = new Dog();
//	Dog sameDog = getObject(aDog);
//    }
//    
//    public Object getObject(Object o) {
//	return o;
//    }

//    Good
    public void go() {
	Dog aDog = new Dog();
	Object sameDog = getObject(aDog);

    }

    public Object getObject(Object o) {
	return o;
    }

}
