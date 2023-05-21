import java.util.Scanner;

public class java01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		num[0] = 1;
		
		for (int i : num) {
			System.out.print(i + " ");
		}
		
		int moveLocation = sc.nextInt();
		
		num[0] = 0;
		num[moveLocation - 1] = 1;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
	
}
