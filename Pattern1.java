
public class Pattern1 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			for(int c=5,p=1;p<=r;c--,p++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
