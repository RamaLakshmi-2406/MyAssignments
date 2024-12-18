package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range=8;
		int first=0;
		int second=1;
		System.out.println("The range of the series is "+range);
		if(first<=range) {
			System.out.print(first);
		}
		while(second<=range) {
			System.out.print(","+second);
		int next=first+second;
		first=second;
		second=next;
	}
	

}}
