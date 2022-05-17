package abstractclass;

public class FillColor extends Color{
	
	public void showColor() {
	System.out.println("Color is : " +colorName);
}
	public static void main(String[] args) {
		FillColor color=new FillColor();
		color.setColor("Pink");
		color.showColor();
	}
	}
