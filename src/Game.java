import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inputs = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < inputs; i++) {
			String s = sc.nextLine();
			
			int number0 = 0;
			int number1 = 0;
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '0') {
					number0++;
				} else {
					number1++;
				}
			}
			
			// key algo: min 1/0 must be odd
			
			int min = 0;
			
			if (number0 >= number1) {
				min = number1;
			} else {
				min = number0;
			}
			
			if (min % 2 == 0) {
				System.out.println("NET");
			} else {
				System.out.println("DA");
			}
			
			/*
			if (number0 == 0 || number1 == 0) {
				System.out.println("NET");
			} else if ((number0 % 2 == 0) && (number1 % 2 == 0)) {
				System.out.println("NET");
			} else {
				System.out.println("DA");
			}
			*/
			
		}
		sc.close();
	}

}
