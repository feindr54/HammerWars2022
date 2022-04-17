import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int l1 = 0;
			int l2 = 0;
			int l3 = 0;
			for (int j = 0; j <3; j++) {
				if (j == 0) {
					l1 = Integer.parseInt(sc.next());
				} else if (j == 1) {
					l2 = Integer.parseInt(sc.next());
				} else {
					l3 = Integer.parseInt(sc.next());
				}
			}
			sc.close();
			
			// 2 cases 
			if ((l1+l2 == l3) || (l1+l3 == l2) || (l2+l3==l1) ) {
				System.out.println("YES");
			} else if (((l1 == l2) && (l3 % 2 == 0)) || ((l1 == l3) && (l2 % 2 == 0)) || ((l3 == l2) && (l1 % 2 == 0))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
