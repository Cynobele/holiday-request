
package holidayrequest;

/**
 *
 * @author camer
 */
public class RequestCalculations implements CalculateHolidays
{
    public int calcHol(int x, int y)
    {
        int z = x-y;
        
        //x= initial remaining
        //y= requested
        //z= total remaining
           
        return z;
    }
    
    public int calcReq(int x, int y)
    {
        int z = x+y;
        
        //x = initial requested
        //y = new
        //z = total
        
        return z;
    }
    
    public boolean authorizeHol(int z)
    {
        if(z>=0) //if there are enough holidays remaining, approve
        {
            return true;
        }
        else //deny
        {
            return false;
        }
    }
}
