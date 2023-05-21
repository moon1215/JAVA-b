import java.util.Scanner;

public class java03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] num = new int[5][5];
		int a = 0;
		int b = 0;
		num[a][b]=1;
			
		while(true) {
			for(int i =0; i<num.length; i++) {
				for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
			}
			
			int moveLocation = 0;
			moveLocation = sc.nextInt();
			
			if(moveLocation==1) {
				num[a][b]=0;
				b++;
				num[a][b]=1;
			}
			else if(moveLocation==-1) {
				num[a][b]=0;
				b--;
				num[a][b]=1;
			}
			else if(moveLocation==2) {
				num[a][b]=0;
				a--;
				num[a][b]=1;
			}
			else if(moveLocation==-2) {
				num[a][b]=0;
				a++;
				num[a][b]=1;
			}
			else if(moveLocation==0) {
				System.out.println("Á¾·á");
				break;
			}
	
		}
		
	}			

}