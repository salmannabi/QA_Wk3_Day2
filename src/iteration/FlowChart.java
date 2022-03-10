package iteration;

public class FlowChart {
	public void fcOne() {
		for (int a = 0; a < 200; a++) {
			System.out.println(a + " : A");
		}
	}
	
	public void fcTwo() {
		for (int a = 0; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println(a + " : -");
			} else {
				System.out.println(a + " : *");
			}
		}
	}
	
	public void tenTimes() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Printing Times: " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
	
	public void nTimes() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Printing " + i + " as many times");
			for (int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
	}
}
