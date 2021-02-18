import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
		int num=obj.nextInt();
		
		if(num>=-9 && num<10)
			System.out.println("num is single");
		else
			System.out.println("num is not single");

	}

}
