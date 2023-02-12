
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using for loop to print numbers from 0 to 9
		for (int i=0;i<10;i++) {
			System.out.println("Counter is "+i);
		}
		//using for loop to print all multiples of 2 from 0to9
		for(int i=0;i<10;i++) {
			if(i%2 ==0) {
				System.out.println(i+" is a multiple of 2");
			}
		}
		//creating some fun patterns using for loops
		//Half pyramid using "*"
		System.out.println();
		System.out.println("half pyramid usinf\"*\"");
		System.out.println();
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Half pyramid using numbers
		System.out.println();
		System.out.println("half pyramid using numbers");
		System.out.println();
		int same=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(j+" ");
				System.out.print(same+" ");//to print same number in each row
				}
			same++;
			System.out.println();
			}
		
		//half pyramid using alphabets
		System.out.println();
		System.out.println("half pyramid using Alphabets");
		System.out.println();
		char alphabet='A';
		for(int i=1;i<=26;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(alphabet+" ");
				//alphabet++; //to print continues alphabets  
				}
			alphabet++; // to print same alphabet in each rows
			System.out.println();
			}
		
		// inverted half pyramid using "*"
		System.out.println();
		System.out.println("inverted half pyramid using \"*\"");
		System.out.println();
		for(int i=10;i>0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("inverted half pyramid usong numbers");
		System.out.println();
		same=10;
		for(int i=10;i>0;i--) {
			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
				System.out.print(same+" ");
			}
			same--;
			System.out.println();
		}
		

	}

}
