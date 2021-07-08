package knightingale;

import java.util.Scanner;

public class Conditiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int x=scan.nextInt();
		

if (x%2==0) {
	System.out.println("Even number  ...");
	
}
else {
	System.out.println("Odd number   ....");
}

System.out.println((x%2==0)?"Even number..tee":"Odd number..tee");//ternary
switch(x%2) //switch is next best
{
	case 0:{
		System.out.println("Even number.....sc");
		break;
	}
	case 1:{
		System.out.println("Odd Number......sc");
		break;
	}
}



}

}