
package looping;

/*method1 using methods*/
public class AllFactors{
	public void findFactors(int num) {
		int i=1;
		while(i<num+1) {
			if(num%i==0) {
			System.out.println(i);
			
		}
			i++;
		}
	}
	public static void main(String args[]) {
		AllFactors factors=new AllFactors();
		factors.findFactors(45);
	}
}





/* method 2
public class AllFactors {

  public static void main(String[] args) {
    int number = 60;
    System.out.print("Factors of " + number + " are: ");
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
*/