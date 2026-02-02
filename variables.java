
import java.util.Scanner;
public class variables{
		public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			String name;
			double student_marks;
			char grade;
			String address;
			long mobilenumber;
			int age;
			System.out.println("enter your name:");
			name=sc.next();
			System.out.println("enter student_marks:");
			student_marks=sc.nextDouble();
			System.out.println("enter your grade:");
			grade=sc.next().charAt(0);
			System.out.println("enter your address:");
			address=sc.next();
			System.out.println("enter your mobilenumber:");
			mobilenumber=sc.nextLong();
			
	
	}
}