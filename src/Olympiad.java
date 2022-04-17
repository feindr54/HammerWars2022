import java.util.Scanner;

public class Olympiad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputs = sc.nextInt();
		sc.nextLine();
		
		int[] array = new int[inputs];
		int[] rArray = new int[inputs];
		
		for (int i = 0; i < inputs; i++) {
			array[i] = Integer.parseInt(sc.next());
		}
		
		sc.close();
		
		int numberOfWays = 0;
		int rIndex = 0;
			
		boolean repeated = false;
		
		for (int i = 0; i < inputs; i++) {
			repeated = false;
			if (array[i] != 0) {
				for (int j = 0; j < inputs; j++) {
					if (array[i] == rArray[j]) {
						repeated = true;
						break;
					}
				}
				if (!repeated) {
					rArray[rIndex++] = array[i];
					numberOfWays++;
				}
				
			}
		}
		System.out.println(numberOfWays);
	}
}
