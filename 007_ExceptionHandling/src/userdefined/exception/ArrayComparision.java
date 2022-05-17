package userdefined.exception;

public class ArrayComparision {
	public static double arrayElementCompare() {
		int arr1[]={23,45,67,90};
		int arr2[]={23,45,3};
		double res=0;
		try {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==0)
					throw new CustomException("Element can not be zero");
			res=(arr1[i]/arr2[i]);
			}
		}catch(CustomException e1){
			System.err.println(e1.getMessage());
		}catch(Exception e2) {
			System.err.println(e2.getMessage());
			
		}
		finally {
			System.out.println("Application executed......");
		}
		return res;
	}

	public static void main(String[] args) {
		arrayElementCompare();

	}

}
