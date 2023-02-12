
public class JavaOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JAVA Operators
		//Arithmetic operators
		double a= 20;
		double b=50;
		//addition 
		int sum =(int)(a+b);
		// Subtraction
		int diff= (int)(a-b);
		// Multiplication
		int mult=(int)(a*b);
		//Division
		double div=a/b;
		// Remainder
		int rem=(int)(a%b);
		System.out.println("Using arithmetich operations");
		System.out.println("addition a and b is "+sum);
		System.out.println("Substraction of a and b is "+diff);
		System.out.println("Multiplication of a and b is "+mult);
		System.out.println("Quotient of a and b is "+div);
		System.out.println("Remainder of a and b is "+rem);
		
		/*
		 
		 --relational operations--
		   == --> Equal to
		   != --> Not Equal to
		   < --> Less than
		   > --> greater than
		   <= --> less than or equal to
		   >= --> greater than to equal to 
		   
		 --logical operations-- 
		  ! --> not
		  && --> Logical AND
		  || --> Logical OR
		  
		 */
		
		int x= 90;
		int y= 10;
		System.out.println("");
		System.out.println("Using relational operations\n Using \"==\" relational operation ");
		
		if (x==y) {  // using "==" relation operation 
			System.out.println("x is equal to y");
			System.out.println("Using \"==\" operation \n in if block");
			
		}else {
			System.out.println("x is not equal to y");
			System.out.println("Using \"==\" operation \n in else block");
		}
		
		if (x!=y) {  // using "==" relation operation 
			System.out.println("x is  not equal to y");
			System.out.println("Using \"!=\" operation \n in if block");
		}else {
			System.out.println("x is equal to y");
			System.out.println("Using \"!=\" operation \\n in else block");
		}
		if(x>y) {
			System.out.println("x is greater than y");
			System.out.println("Using \">\" operation ");
		}else {
			System.out.println("y is greater than x \n Using \">\" operation ");
		}
		if(x<y) {
			System.out.println("x is less than y");
			System.out.println("Using \"<\" operation ");
		}else {
			System.out.println("y is less than x \n Using \">\" operation ");
		}
		if(x>=y) {
			System.out.println("x is greater than or equal to y");
			System.out.println("Using \">=\" operation ");
		}else {
			System.out.println("y is greater than or equal to  x \n Using \">=\" operation ");
		}
		if(x<=y) {
			System.out.println("x is less than or equal to y");
			System.out.println("Using \"<=\" operation ");
		}else {
			System.out.println("y is less than or equal to x \n Using \"<=\" operation ");
		}
		
		
	}

}
