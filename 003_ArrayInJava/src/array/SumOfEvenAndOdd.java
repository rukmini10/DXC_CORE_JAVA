/*
//write java code to get n elements from user and find out sum of even and sum of odd number
1,2,3,4,5,6
sum of even =2+4+6
sum of odd=1+3+5
*/

package array;

import java.util.Scanner;

public class SumOfEvenAndOdd
{
    public static void main(String[] args) 
    {
        int num, sumEven = 0, sumOdd = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        num = s.nextInt();
        int[] a = new int[num];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < num; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < num; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumEven = sumEven + a[i];
            }
            else
            {
                sumOdd = sumOdd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumEven);
        System.out.println("Sum of Odd Numbers:"+sumOdd);
    }

}