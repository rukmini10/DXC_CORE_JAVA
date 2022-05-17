package functioninterface;
@FunctionalInterface
interface FunctionalWithDefaultAndStaticMethod{
	public default int squareFinder(int num) {
		return num*num;
	}
	public static void printNTimesMessage(String message,int n) {
		for(int i=0;i<n;i++) {
			System.out.print("\n i="+(i+1)+":"+message);
		}
	}
	
	public int productFinder(int num1,int num2);
}
public class FunctinalInterfaceWithDefaultAndStaticMethod {

	public static void main(String[] args) {
		FunctionalWithDefaultAndStaticMethod ref=(num1,num2) -> num1*num2;
		
		System.out.print("\n productFinder "+ref.productFinder(9,8));
		System.out.print("\nsquareFinder "+ref.squareFinder(7));
		FunctionalWithDefaultAndStaticMethod.printNTimesMessage("Hindustan",7);
	}

}
