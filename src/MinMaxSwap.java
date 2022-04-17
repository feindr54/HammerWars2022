import java.util.Scanner;

public class MinMaxSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inputs = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < inputs; i++) {
			int numbers = sc.nextInt();
			sc.nextLine();
			
			int[] array1 = new int[numbers];
			int[] array2 = new int[numbers];
			
			int[] minArray = new int[numbers];
			int[] maxArray = new int[numbers];
			
			for (int j = 0; j < numbers; j++) {
				array1[j] = Integer.parseInt(sc.next());
			}
			for (int j = 0; j < numbers; j++) {
				array2[j] = Integer.parseInt(sc.next());
			}

			
			for (int j = 0; j < numbers; j++) {
				if (array1[j] > array2[j]) {
					maxArray[j] = array1[j];
					minArray[j] = array2[j];
				} else {
					maxArray[j] = array2[j];
					minArray[j] = array1[j];
				}
			}

			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			
			for (int j = 0; j < numbers; j++) {
				if (maxArray[j] > max1) {
					max1 = maxArray[j];
				} 
				if (minArray[j] > max2) {
					max2 = minArray[j];
				} 
			}
			System.out.println(max1*max2);
		}
		sc.close();
	}

}
