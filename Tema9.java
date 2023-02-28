import java.util.Scanner;
public class Tema9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean flag = false;
		for (int i = 2; i <= n / 2; ++i)
			if (n % i == 0)
			{ flag = true; break; }
if (!flag) System.out.println(n + " este nr prim"); 
else System.out.println(n + " nu este nr prim.");  
			
	}

}
