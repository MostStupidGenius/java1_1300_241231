package day05;

public class DimensionalArray {

	public static void main(String[] args) {
//		다차원 배열(2차원까지만)
//		배열 안에 배열이 들어간 구조로
//		선언할 때 int[][]와 같이 타입을 정하면
//		2차원 배열로 선언된다.
//		int[]만을 요소로 가질 수 있는 배열이다.
//		내부의 int[]의 길이는 서로 다를 수 있다.
		int[][] arrInts = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
//		내부의 값에 접근하는 방법
//		행렬에 접근하는 것처럼 생각한다
//		arrInts[행][열] -> int타입의 값이 나온다.
		System.out.println(arrInts[1][2]); // 6
		
		for (int i = 0; i < arrInts.length; i++) {
			System.out.print("{");
			for (int j = 0; j < arrInts[i].length; j++) {
				System.out.print(arrInts[i][j] + ", ");
			}
			System.out.print("}\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
