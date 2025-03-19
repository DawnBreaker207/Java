package Head_First.Chapter3;

class Dog {
    String name;

    void bark() {
	System.out.println(name + " bark !!!");
    };

    void eat() {
	System.out.println(name + " eat.");
    }

    void chaseCat() {
	System.out.println(name + " chase cat.");
    }
}

public class Array {

    public static void main(String[] args) {
//	int[] nums;
//	nums = new int[7];
//	nums[0] = 1;
//	nums[1] = 2;
//	nums[2] = 3;
//	nums[3] = 4;
//	nums[4] = 5;
//	nums[5] = 6;
//	nums[6] = 7;

	Dog[] pets;
	pets = new Dog[5];
	System.out.println(pets.length);
	pets[0] = new Dog();
	pets[0].name = "Lmao";
	pets[0].bark();
	pets[1] = new Dog();
	pets[1].name = "ok";
	pets[1].bark();
	pets[3] = pets[0];
	pets[3].bark();
	pets[2] = new Dog();
	pets[2].name = "check";
	pets[4] = new Dog();
	pets[4].name = "Fido";
	pets[4].bark();
	pets[4].chaseCat();

	int x = 0;
	while (x < pets.length) {
	    pets[x].bark();
	    pets[x].chaseCat();
	    x = x + 1;
	}
    }

}
