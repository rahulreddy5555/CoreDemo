import java.util.Scanner;

public class Switchdemo {

	public static void main(String[] args) {
		int a,b;
		int res=0;
	    String op;
	   Scanner s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("enter operator to use");
	     op=s.next();
	     switch(op) {
	     case "+":
	    	 res=a+b;
	    	 break;
	     case "-":
	    	 res=a-b;
	    	 break;
	     case "/":
	    	 res=a/b;
	    	 break;
	     case "*":
	    	 res=a*b;
	    	 break;
	     default:
	    	 System.out.println("invalid operator");
	    	
	     }
	     System.out.println(res);
	}

}
