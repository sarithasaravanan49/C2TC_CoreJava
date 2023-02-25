
public class NestedForLoop {

	public static void main(String[] args) {
		for( int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(1);
			}
			System.out.println();
	}
    for(int i=1;i<=3;i++) {
    	for(int j=3;j>=1;j--) {
    		if(i==j) System.out.print(1);
    		else System.out.print(" ");
    	}
    	System.out.println();
    }
}
}
