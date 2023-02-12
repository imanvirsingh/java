
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to see how Switch statement is executed
		int command=55;
		
		switch(command) {
		case 0:
			System.out.println("CodeRunner running to North");
			break;
		case 1:
			System.out.println("CodeRunner running to South");
			break;
		case 2:
			System.out.println("CodeRunner running to East");
			break;
		case 3:
			System.out.println("CodeRunner running to West");
			break;
			default :
				System.out.println("CodeRunner running is confused doesn't know where to go");
		}
	}

}
