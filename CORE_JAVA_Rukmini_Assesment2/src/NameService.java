import java.util.Scanner;
import java.util.Vector;

public class NameService {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Select your Choice:");
    System.out.println("\n1.Accepting the first name and surname\n2.display total name\n3.Exit.");
    int choice=Integer.parseInt(sc.nextLine());
    Vector v1=new Vector ();
    Vector<Name> v2=new Vector<Name>();

    while(choice !=3)
    {
        if(choice==1)
        {
            System.out.println("enter number of persons :");
            int n=Integer.parseInt(sc.nextLine());
            for(int i=1;i<=n;i++)
            {
                System.out.println("Enter your first name  :"+(i));
                String fn =sc.nextLine();
                System.out.println("Enter your sur name :"+(i));
                String ln =sc.nextLine();
                 v1.add( new Name( fn, ln));
            }
        }
        System.out.println("\n\n Enter the choice:");

   System.out.println("\n1.Accept first name and surname\n \n2.display total names\n3.Exit.");
                choice=Integer.parseInt(sc.nextLine());
        if(choice==2)
        {
            System.out.println("\nTotal Names present in vector is :"+v1.size()+"\n\n");
        }
    }
    System.out.println("thank you");
}
}
