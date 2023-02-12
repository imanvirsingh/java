
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to see how Switch statement is executed
		int Command=0;
		
		switch(Command) {
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
		
		int balance=1000;
		int amount=100;
		int now;
		String command="l;d";
		
		switch(command) {
		case "Withdraw":
			now=balance-amount;
			System.out.println("Your balance used to be "+balance+", and now is "+now+".");
			break;
		case "Deposit":
			now=balance+amount;
			System.out.println("Your balance used to be "+balance+", and now is "+now+".");
			break;
			default:
				System.out.println("Your balance is "+balance+", no changes made");
		}
	}

}
