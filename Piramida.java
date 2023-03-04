
public class Piramida {
    private int n;
   
    public Piramida(int n) {
        this.n = n;
    }

    public void printPiramida() {
    	        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
           
            for (int j = 1; j <= 2 * i ; j++) /*int j = 1; j <= 2 * i ; j++)*/
            {
            System.out.print(n+1-i);
 
            }
            
            System.out.println();
        }
        
    }
}
