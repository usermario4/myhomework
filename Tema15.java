import java.util.Scanner;
public class Tema15 {

	public static void main(String[] args) {
	int sc=0;
		 for (int i=3020;i<=3929;i++)
		{
		sc=sc+i%10;	
		i=i/10;
		if(sc%9==0)
			System.out.println("sc doi "+sc);
		}
		
	}

}
/*do{s=s+(n%10);
n=Math.floor(n/10)}
while(n>0);
console.log(s);*/ 