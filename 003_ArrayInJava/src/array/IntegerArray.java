package array;

public class IntegerArray {
	
	public static void main(String[] args) {
		//array is a collection of same data type values having fix length
		//1.declare array reference
		int arr[];
		//2.declare number of elements that to be with arr
		arr=new int[5];
		//3.storing information int
		arr[0]=12;
		arr[1]=23;
		arr[2]=62;
		arr[3]=93;
		arr[4]=100;
		
		System.out.println(arr[4]);
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		
	}

}