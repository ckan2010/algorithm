package matrix;

public class MagicSquare {
	public static void main(String[] args) {
		new MagicSquare().execute();
	}
	int length=5; // row, col 의 길이
	int row;
	int col;
	int val; // 한 셀에 들어가는 값
	int remainder; // 나머지
	int matrix[][]; // 
	public void execute(){
		// 전체 코딩 
	}
	public void print(){
		for(col=0;col<length;col++){
			for(row=0;row<length;row++){
				System.out.println(matrix[col][row]+"\t");
			}
		}
	}
}
