import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter num");
        int num=obj.nextInt();
        
        if(num%2==0)
        	System.out.println("even");
        else
        	System.out.println("odd");
	}

}
