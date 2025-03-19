package Head_First.Chapter10;

public class TestFormats {
    long hardToRead = 1000000000;
    long easierToRead = 1_000_000_000;
    long legalButSilly = 10_0000_0000;

    public static void main(String[] args) {
	long myBillion = 1_000_000_000;
	String s = String.format("%,d", myBillion);
	System.out.println(s);
    }

}
