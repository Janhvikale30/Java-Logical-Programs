package logicalProblems;

public class CheckPrime {
	public static void main(String[] args) {
		
		int n = 20;
		boolean isPrime = true;
		
		if(n<0) {
			isPrime=false;
		}
		for(int i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(n+" is Prime");
		}else {
			System.out.println(n+" is not Prime");
		}
	}

}
