import java.util.Scanner;

public class Fordemo {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			if(i==5)
				continue;
			System.out.println(i);
   
		}
		
		obj.close();
	}

}
