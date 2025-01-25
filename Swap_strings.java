
public class Swap_strings {

	public static void main(String[] args) {
		String a="RAMAVATH";
		String b="NARENDAR";
		System.out.println("Before Swaping.....");
		System.out.println("a---->"+a);
		System.out.println("b---->"+b);
		
		// String t;
		
		a=a+b; // without using temporary variable 
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		
		
		
		/*t=a;
		a=b;   // using temporary variable
		b=t;
		*/
		
		
		System.out.println("After Swaping......");
		System.out.println("a---->"+a);
		System.out.println("b---->"+b);
	}

}
