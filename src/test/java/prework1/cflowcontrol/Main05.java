package prework1.cflowcontrol;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		for (int i = 1; i <= 10; i++) {
			resultFor = i + resultFor;
		}
		int i = 1;
		while (i <= 10) {
			resultWhile = resultWhile + i;
			i = i + 1;
		}
		System.out.println(resultWhile);
		System.out.println(resultFor);
	}

}
