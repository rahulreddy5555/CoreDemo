import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int a,b;
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		if(a>b)
			System.out.println(a+" is greatest");
		else
			System.out.println(b+" is greatest");
	}

}
