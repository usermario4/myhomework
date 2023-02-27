import java.util.Scanner;
public class Tema3 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("a=");
		int a=input.nextInt();
		System.out.print("b=");
		int b=input.nextInt();
		
		if(a%2== 0 && b%2== 0)
			System.out.println("media aritmetica="+((a+b)/2));
		if(a%2==1 && b%2==1)
			System.out.println("Produs="+(a*b));
		if((a%2==0 && b%2==1 )||(b%2==0 && a%2==1 ) )
			System.out.println("Suma="+(a+b));
	}

}
