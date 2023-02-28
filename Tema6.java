import java.util.Scanner;
public class Tema6 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("n=");
		int n=input.nextInt();
		float si=0;
		for(int i=1;i<=n;i++)
		{
			if (i%2==1)
				si=si+i;}
			System.out.print("si="+si);
			
		
		
	}
	
}
