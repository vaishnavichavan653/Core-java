// Arithmetic opretors:+,-*,/,%
import java.util.Scanner;
public class operators{
    public static void main(String[]abc){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1:");
        int num1=sc.nextInt();
        System.out.println("enter num2:");
        int num2=sc.nextInt();
        System.out.println("addition of two numbers         :"  +(num1+num2));
        System.out.println("substraction of two numbers     :"  +(num1-num2));
        System.out.println("multiplication of two numbers   :" +(num1*num2));
        System.out.println("division of two numbers         :"   +(num1/num2));
        System.out.println("modulas of two numbers          :" +(num1%num2));
    }
}


// Relatioal opretors <,>,<=,>=,==,!=
import java.util.Scanner;
public class operators{
    public static void main(String[]abc){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1:");
        int num1=sc.nextInt();
        System.out.println("enter num2:");
        int num2=sc.nextInt();
        System.out.println("num1>num2:"+(num1>num2));
        System.out.println("num1<num2:"+(num1<num2));
        System.out.println("num1<=num2:"+(num1<=num2));
        System.out.println("num1>=num2:"+(num1>=num2));
        System.out.println("num1==num2:"+(num1==num2));
        System.out.println("num1!=num2:"+(num1!=num2));
    }
}


// Logical opretors && ,||,!

import java.util.Scanner;
public class operators{
    public static void main(String []abc){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a>b && a<b);
        System.out.println(a<b || a>b);
        System.out.println(a<=b && a>=b);
        System.out.println(a>=b || a<=b);
        System.out.println(a==b && a<b);
        System.out.println(a!=b || a<b);
    }
}



// assigment opretors +=,-=,*=,/=,%=,==
import java.util.Scanner;
public class operators{
	public static void main(String[]abs) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		System.out.println("initial value of num:"+num);
		num+=5;
		System.out.println("after num +=:"+num);
		num-=3;
		System.out.println("After a-=3:"+num);
		num*=2;
		System.out.println("After a*=2:"+num);
		num/=4;
		System.out.println("After num/=4:"+num);
		num%=3;
		System.out.println("After a%=3:"+num);
		sc.close();
		
		
		
		
	}
}


// unary opretors
// the operator which works on single poerand

package corejava;
public class opretors{
	public static void main(String[] args) {
		int a=100;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
	}
}


// Turnary opretors
package corejava;
public class opretors{
	public static void main(String[]args) {
		int a=10,b=20;
		String result=(10>20)? "10 lahan aahe": "10 lahan nahi" ;
		System.out.println(result);
	}
}







