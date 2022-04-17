import java.util.Scanner;

public class ComboLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int digits = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		String combo = sc.nextLine();
		sc.close();
		
		int digit1 = 0;
		int digit2 = 0;
		int actions = 0;
		for (int i = 0; i < digits; i++) {
			digit1 = Integer.valueOf(input.charAt(i));
			digit2 = Integer.valueOf(combo.charAt(i));
			
			if (Math.abs(digit1 - digit2) <= (10-Math.abs(digit1 - digit2))) {
				actions += Math.abs(digit1 - digit2);
			} else {
				actions += 10 - Math.abs(digit1 - digit2);
			}
		}
		
		System.out.println(actions);
	}

}
