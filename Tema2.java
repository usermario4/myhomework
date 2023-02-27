import java.util.Scanner;
public class Tema2 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int nr=input.nextInt();
		
		switch(nr) {
		case 1:System.out.println("UNU");break;
		case 2:System.out.println("DOI");break;
		case 3:System.out.println("Trei");break;
		case 4:System.out.println("Patru");break;
		case 5:System.out.println("Cinci");break;
		default:
			System.out.println("Invalid");
		}
	}
}
