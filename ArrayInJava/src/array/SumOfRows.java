/*
write java code to find sum of rows of 3*4 matrix
row1 sum 
row2 sum
row 3 sum
*/
package array;
import java.util.Scanner;

public class SumOfRows {
public static void main(String[] args) {
	
	int arr[][]; 
	int rows=3,cols=4;
	arr=new int[rows][cols];
	Scanner input=new Scanner(System.in);
	System.out.println("Enter matrix row by row: ");
	
	for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[0].length; col++) {
            arr[row][col] = input.nextInt();
        }
    }
	
	for (int row = 0; row < arr.length; row++) {
        int rowSum = 0;
        for (int col = 0; col < arr[row].length; col++) {
            rowSum += arr[row][col];
        }
        System.out.println("Sum of the elements at row " + row + " is: " + rowSum);
    }

    
    for (int col = 0; col < arr[0].length; col++) {
        int colSum = 0;
        for (int row = 0; row < arr.length; row++) {
            colSum += arr[row][col];
        }
        System.out.println("Sum of the elements at col " + col + " is: " + colSum);
    }
}}





