import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long start = sc.nextInt();
		long number = sc.nextInt();
		long step = sc.nextInt();
		
		sc.close();
		
		if (start > number && step > 0) {
			System.out.println("NO");
		} else if (start < number && step < 0) {
			System.out.println("NO");
		}
		else if (step == 0) {
			if (number == start) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		else if ((number - start) % step == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
