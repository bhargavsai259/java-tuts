package myfirstjavaprogram;

import java.util.Scanner;

public class breakcontinue {
	public static int i=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("enter number1");
			int a=sc.nextInt();
			
			System.out.println("enter number2");
			int b=sc.nextInt();
			i++;
			
			if(b==0)
			{
				continue;
			}
			
			System.out.println(a+"/"+b+" is "+(a/b));
		}
		
		while(i<3);
		
		System.out.println("The end");
		
		sc.close();
	}

}
