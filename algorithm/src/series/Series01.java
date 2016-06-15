/**
 * 
 */
package series;

/**
 * @date   :2016. 6. 15.
 * @author :ckan
 * @file   :Series01.java
 * @story  :
 */
public class Series01 {
	public static void main(String[] args) {
		/**
		 * 1+2+4+7+11+16+...의 순서로 
		 * 나열되는 수열의 
		 * 20번째 항까지의 합계
		 * */
		int sum = 0, preNum = 1;
		int[] serie = new int[20];
		
		for (int i = 0; i < 20; i++) {			
			serie[i] = preNum+i;
			preNum = serie[i];
			sum = sum + serie[i];
		}
		System.out.println(sum);
	}
}
