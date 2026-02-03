// import java.util.Scanner;
// public class ifstatement{
// 	public static void main(String[]arg) {
// 		Scanner sc =new Scanner(System.in);
// 				System.out.println("enter your age");
// 				int age=sc.nextInt();
// 				if (age<10)
// 				{
// 				System.out.println("you are child");
// 					}
// 				if(age>10 && age<30) {
// 					System.out.println("you are young");
// 				}
// 				if(age>30) {
// 					System.out.println("you are old");
// 				}
		
// 	}
//     } 





import java.util.Scanner;
public class ifstatement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product price:");
		double price=sc.nextDouble();
		if(price >=20000) {
			System.out.println("you will get 20% discount");
			
		}
		if (price>=10000 && price<20000) {
			System.out.println("you will get 10%discount");
			
		}
		if(price>=5000 && price<10000) {
			System.out.println("you will get 5% discount");
		}
		if(price>=1000 && price<5000) {
			System.out.println(" you have no discount");
		}
		sc.close();
	}
}