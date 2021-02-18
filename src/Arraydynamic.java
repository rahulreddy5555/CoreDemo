import java.util.Scanner;

public class Arraydynamic {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter length");
		int n=obj.nextInt();
		int arr[]=new int[n];
		int sum=0;
		
		for(int i=0;i<n;i++) {
			System.out.println("enter elements");
			arr[i]=obj.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum is: "+sum);
	}

}
