package Head_First.Chapter11;

import java.util.*;

public class TestTree {

    public static void main(String[] args) {
	new TestTree().go();
    }

    public void go() {
	Book b1 = new Book("How Cats Works");
	Book b2 = new Book("Remix your Body");
	Book b3 = new Book("Finding Nemo");
	Set<Book> tree = new TreeSet<>((o1 , o2) -> o1.title.compareTo(o2.title));
	tree.add(b1);
	tree.add(b2);
	tree.add(b3);
	System.out.println(tree);
    }
}

class Book {
     String title;

    public Book(String t) {
	this.title = t;
    }
    public String toString() {
	return title;
    }
   
}
