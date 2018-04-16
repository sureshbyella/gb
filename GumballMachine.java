package gb;
public class GumballMachine  
{

    public int nogmballs;
    private boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialize instance variables
        this.nogmballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.nogmballs > 0 )
    		{
    			this.nogmballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Gumball Ejected..." ) ;
    		}
    		else
    		{
    			System.out.println( "No  Gumballs..." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
