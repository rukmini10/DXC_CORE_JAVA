/*
design area calculator for circle, rectangle and square
note:no system.out.println()
and scanner is not allowed for main method
*/
package area;

public class Area {
	public int square(int side) {
		return side*side;
	}
	public int rectangle(int length,int breadth) {
		return length*breadth;
	}
	public int circle(int radius) {
		return (22/7)*(radius*radius);
	}

}
