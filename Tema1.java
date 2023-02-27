import java.util.Scanner;
public class Tema1 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int nr=input.nextInt();
		//System.out.println("Nr este "+nr);
		if(nr<=10 && nr>0) 
		{
		if (nr<5) 
			System.out.println("RESPINS");
		
		else System.out.println("ADMIS");
		}
		else System.out.println("Invalid");
	}

}
