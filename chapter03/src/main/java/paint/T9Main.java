package paint;

public class T9Main {

	public static void main(String[] args) {
		
		T8Point pt1 = new T8Point(10,50);
		// pt1.setX(10);
		// pt1.setY(50);
		
		drawPoint(pt1);
		//pt1.disappear();
		pt1.show(false);
		
		ColorPoint pt2 = new ColorPoint();
		pt2.setX(100);
		pt2.setY(200);
		pt2.setColor("red");
		
		drawColorPoint(pt2);
		
	}
	
	public static void drawPoint(T8Point pt) {
		pt.show();
	}
	
	public static void drawColorPoint(ColorPoint pt) {
		pt.show();
	}
	
}
