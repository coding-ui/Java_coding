package tns1_pacakage;

public class increments {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		System.out.println("a="+a);


		//post increment.		
		c=a++;//c=10,a=11
		System.out.println("post Increment");
		System.out.println("c="+c+" and "+"a="+a);
		
		//pre increment
		a=10;
		b=20;
		c=++a;//c=11,a=11
		System.out.println("pre increment");
		System.out.println("c="+c+" and "+"a="+a);

		//Example2
		a=10;
		b=20;
		int x=10;
		++a;//a=12
		c=++a +b+ a--;//12 +20+12-- =>42,a=11.
		System.out.println("c="+c+" a="+a);
		int d=c++ +a+ b--;//44++ +11+ 20-- =>75,a=11.
		System.out.println("d="+d+" a="+a);
		//added comment
		



	}

} 
