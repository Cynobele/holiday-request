package holidayrequest;

/**
 * @author camer
 */

public interface CalculateHolidays 
{
    //body is contained in RequestCalculations class
   public int calcHol( int x,int y ); 
   public boolean authorizeHol(int z);
   public int calcReq(int x, int y);
   
   //call above using :
   /*
   example
   
   RequestCalculations rc = new RequestCalculations();
   var = rc.calcHol(5, 2);
   boolVar = rc.authorizeHol(var);
   
   */
    
}