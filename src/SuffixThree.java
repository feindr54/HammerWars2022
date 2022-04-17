import java.util.Scanner;

public class SuffixThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int words = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < words; i++) {
			String word = sc.nextLine();
			if (word.charAt(word.length()-1) == 'o') {
				System.out.println("FILIPINO");
				
			} else if (word.charAt(word.length()-1) == 'u') {
				System.out.println("JAPANESE");
			} else {
				System.out.println("KOREAN");
			}
		}
		sc.close();
	}

}
