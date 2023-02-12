	
public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("Printing the list of even numbers in first 10 numbers");
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		//doing the same with do while loop
		int limit=10;
		int counter=1;
		
		do {
			System.out.println("We keep countig...");
			counter++;
		}while(counter<limit);
		
	}

}
