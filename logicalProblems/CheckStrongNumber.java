package logicalProblems;

import java.util.Scanner;

public class CheckStrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int temp=n;
		int a = n;
		
		int sum=0;
		
		while(temp>0) {
			int digit = temp%10;
			
			int fact=1;
			int i=1;
			
			while(i<=digit) {
				fact = fact*i;
				i++;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==a) {
			System.out.println(a+" is strong number");
		}else {
			System.out.println(a+" is not strong number");
		}
		
	}

}
