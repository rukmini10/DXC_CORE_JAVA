package methodoverriding;

public class ShapeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Shape shape=new Shape();
shape.draw();

Rectangle rect=new Rectangle();
rect.draw();

Square square=new Square();
square.draw();
*/
		
	Shape shape;
	shape=new Shape();
	shape.draw();
	
	shape=new  Rectangle();
	shape.draw();
	
	shape=new  Square();
	shape.draw();
	}

}
