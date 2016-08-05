package series;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		new Fibonacci().execute();
	}
	int term1st,term2nd,term3rd,resultSum,lastTerm,i;
	public void execute(){
		Scanner scanner = new Scanner(System.in);
		term1st = 1;
		term2nd = 1;
		resultSum = 2;
		System.out.println("ENTER THE LAST TERM ?");
		lastTerm = scanner.nextInt();
		/*
		for (i = 0; i <= lastTerm; i++) {
			// 알고리즘 코딩
		}
		*/
	}
	public void print(){
		System.out.println("term1st : "+term1st);
		System.out.println("term2nt : "+term2nd);
		System.out.println("resultSum : "+resultSum);
		System.out.println("lastTerm : "+lastTerm);
		System.out.println("index : "+(i-1));
		System.out.println("term3rd : "+term3rd);
		System.out.println("==============\n"
				+ "Sum up to 10th \n"
				+ "============\n"
				+ "%d");
	}
}
