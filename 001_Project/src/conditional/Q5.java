/*
  
 	Q5: java code to get marks for c,c++,java, find out grade based on avg marks
		   A++ >90
		   A   >80
		   B   >70
		   C   >60
		   D   <60
  
  
 */

package conditional;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the marks of 3 subjects::\n");

   
        float c = keyboard.nextFloat();
        float c_adv = keyboard.nextFloat();
        float java = keyboard.nextFloat();
      

        float total;
        float average;
        char grade;

        total = c+c_adv+java;
        average = (float)(total / 3.0);
       
        if (average >= 90)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 70 && average < 80)
            grade = 'C';
        else if (average >= 60 && average < 70)
            grade = 'D';
        else
            grade = 'E';

        
        System.out.println("\nThe Total marks   = " + total  );
        System.out.println("The Average marks = " + average);
        System.out.println("The Grade         =  '" + grade + "'");
    }
}