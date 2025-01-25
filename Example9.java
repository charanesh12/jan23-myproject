package java4;

public class Example9 {

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
		
			/*
			for (int i=1;i<=100;i++) {
				if(isprime(i)==true) {
					System.out.print(i+" ");
				}
			}*/
			
			findprimeNos(100,500);
			
			

		}
		private static void findprimeNos(int start,int end ) {
			int p=0;
			
			
			for(int i=start;i<=end;i++) {
				int count=0;
				for(int k=1;k<=i;k++) {
					
					if(i%k==0)
						count++;
					
				}
				if(count==2) {
					System.out.print(i+" ");
					p++;
					if(p%4==0) {
						System.out.println();
						//p=8;
					}
				}
			}
		}
	}
