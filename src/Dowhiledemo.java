import java.util.Scanner;

public class Dowhiledemo {

	public static void main(String[] args) {
	    //sum of positive numbers
		    int sum = 0;
		    int number = 0;
		    Scanner input = new Scanner(System.in);
         do {
        	 sum =sum+number;
        	 System.out.println("enter number");
        	 number=input.nextInt();
         }while(number>=0);

        System.out.println("sum=  "+sum);


	}

}
