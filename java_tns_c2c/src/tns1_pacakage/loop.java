package tns1_pacakage;

public class loop {

	public static void main(String[] args) {
		int a=98;
		System.out.println("While loop");
		while(a<100)
		   {			
			System.out.println(a);
		    a++;
		   }
		System.out.println("Do while");
		a=98;
		do {
			System.out.println(a);
		}
		while(a<4);
       
		System.out.println("For loop");
		for(int x=0;x<5;x++) {
		   System.out.println("Hello");
		}
	System.out.println("Nested loop/pattern");	
		for(int i=0;i<5;i++){
			for(int j=0;j<i+1;j++) 
			   {
				System.out.print("*");
			   }
		    System.out.println();
		}
		
	System.out.println("Nested loop box pattern");
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++) 
		   {
			if(i==1||j==1||j==n||i==n){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
			
		   }
	    System.out.println();
	}
	
	
	System.out.println("Nested loop Reverse pattern");
	for(int i=0;i<5;i++){
		for(int j=5;j>i;j--) 
		   {
			System.out.print("*");
		   }
	    System.out.println();
	}
		
		
	}
	
	

}
