
public class Main
{
	public static void main(String[] args) {
		
		/*
		int i = 0;
		
		int n = 10;
		while(i<=n) {
		    System.out.println(i); // move the cursor next line to print
		  //  System.out.print(i); 
		    i = i + 1;
		}
		*/
		int n = 113133223;
		int count = 0;
		while(n != 0) {
		    n  =  n / 10;
		    count = count + 1;
		  //  count++;
		}
		System.out.println(count);
		
	}
}
