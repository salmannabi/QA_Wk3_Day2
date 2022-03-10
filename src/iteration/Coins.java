package iteration;

public class Coins {
	public void changeGiven(double amount, double cost) {
		double change = amount - cost;
		// Converting the double to an integer
		int conChange = (int) (change * 100);
		
		if (change > 0) {
			// Declaring denominations and coins
			int tenNotes = 0;
			int fiveNotes = 0;
			int twoCoins = 0;
			int oneCoins = 0;
			int fiftyPs = 0;
			int twentyPs = 0;
			int tenPs = 0;
			int fivePs = 0;
			int twoPs = 0;
			int onePs = 0;
			
			// For counting notes
			int wChange = conChange / 100;
			// For counting coins
			int fChange = conChange % 100;
			
			// Counting notes
			tenNotes = wChange / 10;
			wChange = wChange % 10;
			
			fiveNotes = wChange / 5;
			wChange = wChange % 5;
			
			twoCoins = wChange / 2;
			oneCoins = wChange % 2;
			
			// Counting coins
			fiftyPs = fChange / 50;
			fChange = fChange % 50;
			
			twentyPs = fChange / 20;
			fChange = fChange % 20;
			
			tenPs = fChange / 10;
			fChange = fChange % 10;
			
			fivePs = fChange / 5;
			fChange = fChange % 5;
			
			twoPs = fChange / 2;
			onePs = fChange % 2;
			
			// Printing number of £10 notes
			if (tenNotes > 0) {
				System.out.print(tenNotes + " £10 Note");
				if (tenNotes > 1) { System.out.print("s"); }
				System.out.println();
			}
			
			// Printing number of £5 notes
			if (fiveNotes > 0) {
				System.out.print(fiveNotes + " £5 Note");
				if (fiveNotes > 1) { System.out.print("s"); }
				System.out.println();
			}
			
			// Printing number of £2 coins
			if (twoCoins > 0) {
				System.out.print(twoCoins + " £2 Coin");
				if (twoCoins > 1) { System.out.print("s"); }
				System.out.println();
			}
			
			// Printing number of £1 coins
			if (oneCoins > 0) {
				System.out.print(oneCoins + " £1 Coin");
				if (oneCoins > 1) { System.out.print("s"); }
				System.out.println();
			}
			
			// Printing number of 50p coins
			if (fiftyPs > 0) {
				System.out.print(fiftyPs + " 50p");
				if (fiftyPs > 1) { System.out.print("'s"); }
				System.out.println();
			}
			
			// Printing number of 50p coins
			if (twentyPs > 0) {
				System.out.print(twentyPs + " 20p");
				if (twentyPs > 1) { System.out.print("'s"); }
				System.out.println();
			}
			
			// Printing number of 50p coins
			if (tenPs > 0) {
				System.out.print(tenPs + " 10p");
				if (tenPs > 1) { System.out.print("'s"); }
				System.out.println();
			}
			
			// Printing number of 50p coins
			if (fivePs > 0) {
				System.out.print(fivePs + " 5p");
				if (fivePs > 1) { System.out.print("'s"); }
				System.out.println();
			}
			
			// Printing number of 50p coins
			if (twoPs > 0) {
				System.out.print(twoPs + " 2p");
				if (twoPs > 1) { System.out.print("'s"); }
				System.out.println();
			}
			
			// Printing number of 50p coins
			if (onePs > 0) {
				System.out.print(onePs + " 1p");
				if (onePs > 1) { System.out.print("'s"); }
				System.out.println();
			}
		}
	}
}
