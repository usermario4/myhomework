import java.util.Scanner;
public class Tema8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	float FACT=1;
	for(int i=1;i<=n;i++) {
		FACT=FACT*i;
	}
	System.out.print(FACT);

		
	}

}
