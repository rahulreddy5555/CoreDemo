import java.util.Scanner;

public class Salarydemo {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
	
		System.out.println("enter employee id");
		String id=ob.nextLine();
		
		System.out.println("enter employeename");
		String name=ob.nextLine();
		
		
		System.out.println("enter BASE SALARY");
		long basepay=ob.nextLong();
		
		System.out.println("enter HRA");
		long hra=ob.nextLong();
		
		System.out.println("enter DA");
		long da=ob.nextLong();
		
		System.out.println("enter pf");
		long pf=ob.nextLong();
		
		long netsalary=(basepay+hra+da)-pf;
		
		System.out.println("your net salary is: "+ netsalary);

	}

}
