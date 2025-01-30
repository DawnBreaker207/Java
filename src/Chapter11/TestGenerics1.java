package Chapter11;

import java.util.*;

abstract class Animal {
    void eat() {
	System.out.println("Animal eating");
    }
}

class Dog extends Animal {
    void bark() {
    }
}

class Cat extends Animal {
    void meow() {

    }
}

public class TestGenerics1 {

    public static void main(String[] args) {

	List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
//	takeAnimals(animals);
//	List<Animal> vaccinatedAnimals = takeAnimals(animals);
//
	List<Dog> dogs = List.of(new Dog(), new Dog());
//	takeAnimals(dogs);
//	List<Dog> vaccinatedDogs = takeAnimals(dogs);

	List<? extends Animal> vaccinatedSomethings = takeAnimals(dogs);
    }

//    public static void takeAnimals(List<? extends Animal> animals) {
//    public static <T extends Animal> void  takeAnimals(List<T> lists) {
    public static List<? extends Animal> takeAnimals(List<? extends Animal> lists) {
//	for ( T a : lists) {
	for (Animal a : lists) {
	    a.eat();
	}
	return lists;
    }

}
