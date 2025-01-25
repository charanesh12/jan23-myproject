
public class Pattern8 {

	public static void main(String[] args) {
		for(int r=5,sp=30;r>=1;r--){
			for(int k=1;k>sp;k++) {
				System.out.print(" ");
				
			}
			sp=sp-1;
			for(int c=1;c<=r;c++) {
				System.out.print("  * ");
				
			}
			
			
			System.out.println();
			
		}
	}

}
