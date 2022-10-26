package paint;

public class T9Main {

	public static void main(String[] args) {
		
		T8Point pt = new T8Point(10,50);
		// pt.setX(10);
		// pt.setY(50);
		
		drawPoint(pt);
		//pt.disappear();
		pt.show(false);
	}
	
	public static void drawPoint(T8Point pt) {
		pt.show();
	}
	
}
