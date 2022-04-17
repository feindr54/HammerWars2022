import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int melons = sc.nextInt();
		
		sc.close();
		
		if (melons % 2 == 0 && melons != 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
