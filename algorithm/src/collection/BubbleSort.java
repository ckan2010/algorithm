package collection;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		new BubbleSort().execute();
	}
	int i,j,temp,length=5;
	int datas[] = new int[length];
	public void execute(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("TOTAL COUNT is 5");
		for(i=0;i<length;i++){}
		System.out.println();
		for(i=0;i<length;i++){}
	}
	public void print(){
		System.out.println("DATA COUNT : "+length);
		String result = "";
		for(i=0;i<datas.length;i++){
			result +=datas[i]+" , ";
		}
		System.out.println("DATA in ascending order \n"
				+ result.substring(0, result.length()-2));
	}
}
