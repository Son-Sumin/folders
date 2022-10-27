package paint;

public class T9Main {

	public static void main(String[] args) {
		
	// point 그리기
		T8Point pt1 = new T8Point(10,50);
		// pt1.setX(10);
		// pt1.setY(50);
		
		drawPoint(pt1); 
		//pt1.disappear();
		pt1.show(false);
	
	// colorpoint 그리기
		T8Point pt2 = new ColorPoint(100, 200 ,"red");
//		ColorPoint pt2 = new ColorPoint();
//		pt2.setX(100);
//		pt2.setY(200);
//		((ColorPoint)pt2).setColor("red");  // upcasting; 자식의 것을 부모가 사용	
//		drawColorPoint(pt2);
		drawPoint(pt2);
		pt2.show(false);
		
		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		drawShape(triangle);
		
		Rectangle rectangle = new Rectangle();
		drawShape(rectangle);
		
		Circle circle = new Circle();
		drawShape(circle);
		
	}
	
//	public static void draw(IDrawable drawable) {
//		
//	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
	
	public static void drawPoint(T8Point pt) {
		pt.show();
	}
	
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	

}
