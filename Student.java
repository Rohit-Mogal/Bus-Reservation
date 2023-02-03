import java.util.Scanner;
class Student
{
	String name;
	int roll;
	int mar;
	int math;
	int hindi;
	

public void getdata()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	name=s.nextLine();
	System.out.println("Enter the roll");
	roll=s.nextInt();
	System.out.println("Enter the mar");
	mar=s.nextInt();
	System.out.println("Enter the math");
	math=s.nextInt();
	System.out.println("Enter the hindi");
	hindi=s.nextInt();
}
public void printdata()
{
	System.out.println("student name"+name);
	System.out.println("student roll"+roll);
	System.out.println("student mar"+mar);
	System.out.println("student math"+math);
	System.out.println("student hindi"+hindi);
}
//public int hashcode()
//{
//	return 10;
//}


	public static void main(String[] args)
	{
		Student obj=new Student();
		System.out.println(obj);
		obj.toString();
	   // obj.getdata();
		//obj.printdata();
	}
}