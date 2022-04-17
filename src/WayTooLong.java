import java.util.Scanner;

public class WayTooLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int words = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < words; i++) {
			String word = sc.nextLine();
			if (word.length() > 10) {
				System.out.println(word.substring(0,1) + (word.length() - 2) + word.substring(word.length()-1));
			} else {
				System.out.println(word);
			}
		}
		sc.close();
	}

}
