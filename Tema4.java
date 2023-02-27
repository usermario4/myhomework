import java.util.Scanner;
public class Tema4 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("a=");
		int a=input.nextInt();
		System.out.print("b=");
		int b=input.nextInt();
		System.out.print("c=");
		int c=input.nextInt();
	
		if(a<b&&a<c)
		System.out.print("min este="+ a);
		if(b<a&&b<c)
			System.out.print("min este="+ b);
		if(c<a&&c<b)
			System.out.print("min este="+ c);
		
		
	}

}
