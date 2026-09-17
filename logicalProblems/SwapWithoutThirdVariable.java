package logicalProblems;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		
		System.out.println("Enter second Number");
		int b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
