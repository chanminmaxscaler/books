package classpart;

public class Function {

	public static void main(String[] args) {

			int num1 = 25;
			int num2 = 30;
			
			int sum = addNum(num1, num2);
			System.out.println(sum);
	}
	public static int addNum(int n1, int n2) { // 반환값이 없으면 void
		int result = n1 + n2;
		return result;
	}

}
