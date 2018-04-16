package gb;

public class GumballMachineMain {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(10);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );  
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		GumballMachine50cents GumballMachine50cents = new GumballMachine50cents(20);
		
		System.out.println(GumballMachine50cents);

		GumballMachine50cents.insertQuarter( 25 );
		GumballMachine50cents.turnCrank();

		System.out.println(GumballMachine50cents);

		GumballMachine50cents.insertQuarter( 25 );
		GumballMachine50cents.turnCrank();
		GumballMachine50cents.insertQuarter( 25 );
		GumballMachine50cents.turnCrank();

		System.out.println(GumballMachine50cents);
		
		GumballMachineAllcoins GumballMachineAllcoins = new GumballMachineAllcoins(20);
		
		System.out.println(GumballMachineAllcoins);

		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.turnCrank();

		System.out.println(GumballMachineAllcoins);

		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.turnCrank();
		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.turnCrank();
		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.turnCrank();
		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.insertQuarter( 25 );
		GumballMachineAllcoins.turnCrank();

		System.out.println(GumballMachine50cents);
	}
}
