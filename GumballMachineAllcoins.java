package gb;



public class GumballMachineAllcoins extends GumballMachine{

	private int amount_of_coins; 
	
	public GumballMachineAllcoins(int size) {
		super(size);
		this.amount_of_coins = 0;
	}
	
    public void insertQuarter(int coin)
    {
        if ( coin >= 0 )
            this.amount_of_coins+=coin ;
    }
    
    public void turnCrank()
    {
    	if ( this.amount_of_coins >= 50 )
    	{
    		if ( this.nogmballs > 0 )
    		{
    			this.nogmballs-- ;
    			this.amount_of_coins -= 50;
    			System.out.println( " Ejected..." ) ;
    		}
    		else
    		{
    			System.out.println( "No  Gumballs.... " ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert 50 cents" ) ;
    	}        
    }

}

