package calc;

public class FindSmaller extends Calculator{
	public int smaller(int num1,int num2) {
		if(num1<num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

	@Override
	public void show(int val) {
		// TODO Auto-generated method stub
		System.out.println("Smaller number is :"+val);
	}

}
