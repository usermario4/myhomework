import java.util.Scanner;
public class Tema5 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("n=");
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++)
		{int sp=0;
			if (i%2==0)
				sp=sp+i;i++;
			System.out.print("sp="+sp);
			
		
		
	}
	}
}
