import java.util.Scanner;

public class java02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int i =0;
		num[i]=1;
		
		while(true) {
			
			for(int arr : num) {
				System.out.print(arr + " ");
			}
			
			int moveLocation = 0;
			moveLocation = sc.nextInt();
			
			if(moveLocation==1) {
				num[i]=0;
				i++;
				num[i]=1;
			}
			else if(moveLocation==-1) {
				num[i]=0;
				i--;
				num[i]=1;
			}
		
		}
		
	}
}