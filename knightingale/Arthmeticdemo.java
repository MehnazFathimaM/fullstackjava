package knightingale;

import java.util.Scanner;

public class Arthmeticdemo {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter the value of i...:");
	int i=scan.nextInt();
	
	System.out.println("Please enterthe value of j....:");
	int j=scan.nextInt();
	
	int add=i+j;
	System.out.println("Addition....:"+add);
	
	int sub=i-j;
	System.out.println("Subtraction....:"+sub);
	
	int mul=i*j;
	System.out.println("Multiplication....:"+mul);
	
	int div=i/j;
	System.out.println("Quotient...:"+div);
	
	int rem=i%j;
	System.out.println("Reminder..."+rem);
			
}
}
