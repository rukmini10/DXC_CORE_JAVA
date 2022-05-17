package functioninterface;
@FunctionalInterface
interface SquareFinder{
	public int findSquare(int num);
}
public class FunctionInterfaceDemo1 {

	public static void main(String[] args) {
		SquareFinder finder=(num) -> num*num;
		int n=25;
		System.out.print("\nsquare of "+n+" is :"+finder.findSquare(n));

	}

}
