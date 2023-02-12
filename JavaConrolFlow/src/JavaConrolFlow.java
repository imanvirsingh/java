
public class JavaConrolFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=30;
		// if statement which evaluates the given expression and runs the block of code if expression is true
		if(x+y>45) {
			System.out.println("x + y is greater than 45");
		}
		// if-else 
		if(x+y<30) {
			System.out.println("x + y is less than 30");
		}else {
			System.out.println("X + y is greater than 30");
			
		}
	// else-if
		char grade='F';
		
		if(grade=='A') {
			System.out.println("A is for Awesome!");
		}else if(grade=='B') {
			System.out.println("A is for Awesome!");
		}else if(grade=='C') {
			System.out.println("C is for Careless.");
		}else if(grade=='F') {
			System.out.println("F is for Future Unknown.");
		}
	}

}
