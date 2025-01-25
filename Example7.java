package java4;

public class Example7 {
	
	static boolean isprime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
			
			
		}
		
		if(count==2) return true;
		else return false;
		
	}

	public static void main(String[] args) {
		
		int num=13;
		if(isprime(num)==true) {
			System.out.println("yes");
			
		}
		else System.out.println("no");
		
		
	}

}
