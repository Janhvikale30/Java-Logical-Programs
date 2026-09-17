package logicalProblems;

public class PrintArmstrongNum {
	public static void main(String[] args) {
		
		int start = 100;
		int end=500;
		
		for(int i=start; i<=end; i++) {
			int temp=i;
			int sum=0;
			
			while(temp>0) {
				int digit=temp%10;
				sum=sum+(digit*digit*digit);
				temp=temp/10;
			}
			
			if(sum==i) {
				System.out.println(i);
			}
		}
	}

}
