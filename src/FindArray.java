import java.util.Scanner;

public class FindArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inputs = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < inputs; i++) {
			int n = Integer.parseInt(sc.next());
			
			int[] array = new int[n];
			
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					array[j] = 2;
					System.out.print(array[j]);
				}
				else {
					array[j] = j + 2;
					System.out.print(" "+array[j]);
				}
				
			}
			System.out.println();
		}
		sc.close();
	}
}
