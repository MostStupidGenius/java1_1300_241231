package day08;

public class ForWithArray {

	public static void main(String[] args) {
		int[] arrInt = new int[10];
//		배열의 길이를 구하는 방법
		int length = arrInt.length;
//		System.out.println(length); // 10
		for (int i = 0; i < arrInt.length; i++) {
//			System.out.println(i);
			if(i == 0){
//				만약 i가 0이면 arrInt[i] 방에 1을 넣어라
				arrInt[i] = 1;
			} else if(i > 0) {
//				만약 i가 0보다 크다면 i-1번째에 있는 값에 2배를 하여 넣어라.
				arrInt[i] = arrInt[i-1] * 2;
			}
		}
		
		for (int i : arrInt) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
