
public class Swap_strings1 {

	public static void main(String[] args) {
		String a="RAMAVATH";
		String b="NARENDAR";
		System.out.println("Before Swaping.....");
		System.out.println("a---->"+a);
		System.out.println("b---->"+b);
		
		// String t;
		
		b=b+a; // without using temporary variable 
		a=b.substring(0,b.length()-a.length());
		b=b.substring(a.length());
		
		
		
		
		/*t=a;
		a=b;   // using temporary variable
		b=t;
		*/
		
		
		System.out.println("After Swaping......");
		System.out.println("a---->"+a);
		System.out.println("b---->"+b);

	}

}
