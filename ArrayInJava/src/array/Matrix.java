package array;
//create 3*3 matrix and simple display
public class Matrix {
	public static void main(String[] args) {
		int arr[][]; //int []arr[] or int[][]arr
		int rows=3,cols=3;
		arr=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=i+j;
				
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

}



/*
write java code to find sum of rows of 3*4 matrix
row1 sum 
row2 sum
row 3 sum
*/



/*
 * 
 * 
 * 
 */











