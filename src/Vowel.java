import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char");
        char c=sc.nextLine().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        	System.out.println("char is vowel");
        else
        	System.out.println("char is not vowel");
        
	}

}
