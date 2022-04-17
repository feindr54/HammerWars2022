import java.util.Scanner;

public class PlusOneSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inputs = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < inputs; i++) {
			int numbers = sc.nextInt();
			sc.nextLine();
			
			int [] array = new int[numbers];
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			
			for (int j = 0; j < numbers; j++) {
				array[j] = Integer.parseInt(sc.next());
				
				if (min > array[j]) {
					min = array[j];
				}
				if (max < array[j]) {
					max = array[j];
				}
			}
			System.out.println(max - min);
		}
		sc.close();
	}

}
