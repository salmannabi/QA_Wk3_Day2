package Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise ex = new Exercise();
		
		System.out.println("Exercise 1");
		System.out.println("-----------------------------");
		System.out.println();
		ex.exOne();
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.println("Exercise 2");
		System.out.println("-----------------------------");
		System.out.println();
		ex.exTwo();
		System.out.println();
		System.out.println("-----------------------------");

		System.out.println("Exercise Numbers 1");
		System.out.println("-----------------------------");
		System.out.println();
		
		ex.oneToNineteen(0);
		ex.oneToNineteen(1);
		ex.oneToNineteen(19);
		ex.oneToNineteen(20);

		System.out.println();
		System.out.println("-----------------------------");

		System.out.println("Exercise Numbers 2");
		System.out.println("-----------------------------");
		System.out.println();

		ex.twentyToNinetynine(19);
		ex.twentyToNinetynine(20);
		ex.twentyToNinetynine(99);
		ex.twentyToNinetynine(100);

		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.println("Exercise Numbers 3");
		System.out.println("-----------------------------");
		System.out.println();

		ex.hundredTo999(99);
		ex.hundredTo999(100);
		ex.hundredTo999(999);
		ex.hundredTo999(1000);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.println("Exercise Numbers 4");
		System.out.println("-----------------------------");
		System.out.println();

		ex.hundredTo9999(999);
		ex.hundredTo9999(1000);
		ex.hundredTo9999(9999);
		ex.hundredTo9999(10000);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		System.out.println("Exercise Numbers 5");
		System.out.println("-----------------------------");
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i < 20) { ex.oneToNineteen(i); }
			else if (i < 100) { ex.twentyToNinetynine(i); }
			else { ex.hundredTo999(i); }
		}
		
		System.out.println();
		System.out.println("-----------------------------");

		

	}
}
