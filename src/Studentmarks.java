import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the Rollno");
		
		String Rollno=ob.next();
		System.out.println("enter the 5 subject marks");
		int sub1=ob.nextInt();
		int sub2=ob.nextInt();
		int sub3=ob.nextInt();
		int sub4=ob.nextInt();
		int sub5=ob.nextInt();
		
		
		if(sub1>100 ||sub2>100 ||sub3>100 ||sub4>100 ||sub5>100)
			 System.out.println("invalid input");
		
		else if(sub1<35 ||sub2<35 ||sub3<35 ||sub4<35 ||sub5<35)
			System.out.println("Failed in exam");
	
		else 
		     {	
	        	int result=sub1+sub2+sub3+sub4+sub5;
		        double percentage=(double)(result*100)/500;
		        System.out.println("Totalmarks: "+500);
	        	System.out.println("Totalmarks secured: "+result);
		        System.out.println("percentage: "+percentage);
		        if(percentage>=80)
			    System.out.println("passed in distinction");
		        else if(percentage>=60)
			    System.out.println("passed in first class");
		        else if(percentage>=35)
			    System.out.println("passed in second class");
		        else
		     	System.out.println("fail");
		     }
		
		}
}
