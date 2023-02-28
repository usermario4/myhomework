import java.util.Scanner;
public class Tema12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
			{if(n%i==0)
				{System.out.println(i);}
		boolean flag = false;
		for (int t = 2; t <= n / 2; t++)
			if (i % t == 0)
			{ flag = true; break; }
while (!flag) 
	System.out.println("div primi sunt "+i)continue;
}
			
	
	}
}
