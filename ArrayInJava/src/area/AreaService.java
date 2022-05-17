package area;



public class AreaService {
	public static void main(String[] args) {
		Area a=new Area();
		InputOutput io=new InputOutput();
		int choice=0,side=0,length=0,breadth=0,radius=0,res;
		do {
			io.output("\n1.Square");
			io.output("\n2.Rectangle");
			io.output("\n3.Circle");
			io.output("\n4.Exit");
			choice=io.input("Enter your choice(0-4)");
			if(choice>=1 && choice<=4) {
				side=io.input("Enter side of a square");
				length=io.input("Enter length of rectangle");
				breadth=io.input("Enter breadth of rectangle");
				radius=io.input("Enter radius of circle");
			}
			switch(choice) {
		case 1:
			res=a.square(side);
			io.output("Area of Square is ",res);
			break;
		case 2:
			res=a.rectangle(length, breadth);
			io.output("Area of rectangle is ",res);
			break;
		case 3:
			res=a.circle(radius);
			io.output(" Area of circle is ",res);
		case 4:
			io.output("App terminated ");
			break;
		default:
			io.error("INvalid choice");
			
				
			}
		}while(choice!=0);
	
	}
}
