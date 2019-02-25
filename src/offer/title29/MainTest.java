package offer.title29;

public class MainTest {
	
	public static void main(String[] args) {
		int[][]matrix = {{1,9,2,4},{2,5,8,10},{3,7,6,9}};
		printMatrix(matrix);
		
	}

	public static void printMatrix(int[][] matrix) {
		
		int rowValue = matrix.length;
		int columnValue = matrix[0].length;
		
		if(rowValue == 0 && columnValue == 0) {
			return;
		}

		int loopValue = (Math.min(rowValue, columnValue) - 1) / 2 + 1;
		for (int i = 0; i < loopValue; i++) {
			for(int k = i; k < columnValue-i; k++) {
				System.out.println(matrix[i][k]);
			}
			for(int j = i+1; j < rowValue - i; j++) {
				System.out.println(matrix[j][columnValue - i -1]);
			}
			for(int k = columnValue-i-2; (k>=i)&&(rowValue-i-1!=i); k--) {
				System.out.println(matrix[rowValue-i-1][k]);
			}
			for(int j = rowValue-i-2; (j>i)&&(columnValue-i-1!=j); j--) {
				System.out.println(matrix[j][i]);
			}
		}
		
	}
	
}
