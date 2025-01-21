package Chapter10;

public class Duck {
    private int size;
//    Only have one instance value in class
    private static int duckCount = 0;
    
    public Duck() {
	duckCount++;
    }
    public static void main(String[] args) {
////	Can not use instance in static
//	System.out.println("Size of the duck is " + size);
////	Can not use non-static methods in static
//	System.out.println("Size of the duck is " + getSize());
	
    }
    public void setSize(int s) {
	size = s;
    }
    
    public int getSize() {
	return size;
    }
}
