import java.util.Scanner;
public class Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int problems = sc.nextInt();
		sc.nextLine();
		
		int solved = 0;
		
		for (int i = 0; i < problems; i++) {
			int known = 0;
			for (int j = 0; j < 3; j++) {
				int person = Integer.parseInt(sc.next());
				known += person;
				
				if (known >= 2) {
					solved++;
					known = 0;
					sc.nextLine();
					break;
				}
			}
		}
		sc.close();
		System.out.println(solved);
	}

}
