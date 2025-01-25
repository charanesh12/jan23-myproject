
public class Primeno {

	public static void main(String[] args) {
			
		for(int i = 1,k=0;i<=100;i++) {
			int num = i;
			int counter=0;
		
		for(int p=num;p>=1;p--) {
			if(num%p==0) counter++;
			
		}
		if(counter==2) {
			System.out.print(num+" ");
			k++;
			if(k%6==0) {
				System.out.println();
				k=0;
			}
		}

	}
}
}