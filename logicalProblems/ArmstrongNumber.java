package logicalProblems;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int a = n;
		int count = 0;
		double sum=0;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		temp=n;
		
		while(temp>0) {
			int digit=temp%10;
			sum = sum+Math.pow(digit, count);
			temp=temp/10;
		}
		
		if(a==sum) {
			System.out.println(a+" is Armstrong");
		}else {
			System.out.println(a+" is not Armstrong");
		}
	}

}
