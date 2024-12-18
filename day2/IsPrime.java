package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n=7;
		boolean isPrime=true;
		if(n<2) {
			System.out.println("It is not a Prime");
		}
		else {
			for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				isPrime=false;
			}
			}
		}
		if(isPrime) {
			System.out.println(n+"-It is a Prime Number");
		}
		else {
			System.out.println(n+"-It is not a Prime Number");
		}
				
			}
			

	}

