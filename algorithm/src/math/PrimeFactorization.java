package math;

import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		new PrimeFactorization().execute();
	}
	int dividend; // 피젯수
	int divisor; // 젯수
	int quotient; // 몫
	int remainder; // 나머지 
	int i; // loop 인덱스
	int input; // 입력받는 수
	int count; // divisor 의 갯수
	int[] primes; // 소수들의 집합
	public void execute(){
		count = 0;
		primes = new int[10]; // 10칸 짜리 기본배열
		System.out.println("ENTER A INTEGER");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		dividend = input;
		if (dividend < 2){return;}
		while (dividend != 1) {
			divisor = 2;
			// 알고리즘 코딩
		}
		if (count==1) {
			System.out.println(input + " is prime number");
		} else {
			print();
		}
	}
	public void print(){
		System.out.println("DIVIDEND : "+dividend);
		System.out.println("DIVISOR : "+divisor);
		String result = "";
		for(i=0;i<primes.length;i++){
			result +=primes[i]+" X ";
		}
		System.out.println("PRIMES : \n"
				+ result.substring(0, result.length()-2));
	}
}
