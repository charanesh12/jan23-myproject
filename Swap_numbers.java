
public class Swap_numbers {

	public static void main(String[] args) {
	
		int a=100,b=200,t=0;
		System.out.println("Before Swaping.....");
		System.out.println("a---->"+a);
		System.out.println("b---->"+b);
		
		
		
		/*a=a+b;  without using temporary variable 
		b=a-b;
		a=a-b;
		*/
		
		
		
		t=a;
		a=b;   // using temporary variable
		b=t;
		
		
		
		System.out.println("After Swaping......");
		System.out.println("a---->"+a);
		System.out.println("b---->"+b);
	}

}
