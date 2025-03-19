package Head_First.Chapter10;

public class MathOperator {

    public static void main(String[] args) {
//	Math.abs
	int x = Math.abs(-240);
	double d = Math.abs(240.45);

//	Math.random
	double r1 = Math.random();
	int r2 = (int) (Math.random() * 5);

//	Math.round
	int xr = Math.round(-24.8f);
	int yr = Math.round(24.45f);
	long zr = Math.round(24.45);

//	Math.min
	int xm = Math.min(24, 240);
	double ym = Math.min(90876.5, 90876.49);

//	Math.max
	int xmax = Math.max(24, 240);
	double ymax = Math.max(90876.5, 90876.49);

//	Math.sqrt
	double xsqrt = Math.sqrt(9);
	double ysqrt = Math.sqrt(42.0);

	
//	Wrapper
	int i=288;
	Integer iWrap = new Integer(i);
	int unWrapper = iWrap.intValue();
	
	
	String s = "2";
	int xparse= Integer.parseInt(s);
	double dparse =Double.parseDouble("423.24");
	boolean bparse =Boolean.parseBoolean("True");
    }

}
