package lesson1;

import java.io.IOException;
import java.util.Scanner;

public class Tasks {

	public Tasks() throws IOException{
		
		//First Task
		
		int a,b;
		//Input Data
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		a = scan.nextInt();
		System.out.print("Enter b: ");
		b = scan.nextInt();
		
		
		//Calculation and output
		System.out.print("a+b=");
		System.out.println(a+b);
		System.out.print("a-b=");
		System.out.println(a-b);
		System.out.print("a*b=");
		System.out.println(a*b);
		System.out.print("a/b=");
		System.out.println(a/b);
		
		//Second Task
		
		System.out.println("How are you? ");
		String answer = scan.next();
		System.out.println("You are " + answer);
		scan.close();
		
		//Third Task
		
		int n,m = 2;
		if(m>0){
			n=1;
		} else if (m==0){
			n=0;
		} else {
			n=-1;
		}
		System.out.printf("When m is %d then n is %d\n",m,n);
		
		//Forth Task
		
		int sum=0;
		for(int i=1; i<=10; i++){
			sum+=i;
		}
		System.out.printf("The sum of first 10 natural numbers is %d\n",sum);
	}

}
