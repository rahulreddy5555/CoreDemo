import java.util.Arrays;

public class Arrayscopy {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5};

        int[] n3 = new int[5];

        int[] n2 = new int[n.length];
		
       System.arraycopy(n, 0, n2, 0, n.length);
       System.out.println("n2  "+Arrays.toString(n2));
       
       System.arraycopy(n, 1, n3, 2, 2);
       System.out.println("n2  "+Arrays.toString(n2));
       

	}

}
