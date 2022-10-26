package chapter03;

public class T12ArrayUtil {
	
	public static double[] intToDouble(int[] a) {
		double[] result = null;
		
		if(a == null) {
			return result;
		}
		
		result = new double[a.length];
		for(int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		
		return result;
	}

}
