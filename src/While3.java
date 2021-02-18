import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner s=new Scanner(System.in);
		int i=1;
		int n=s.nextInt();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum  "+sum);
		s.close();
	}

}
