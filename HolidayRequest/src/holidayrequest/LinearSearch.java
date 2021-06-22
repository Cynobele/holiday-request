package holidayrequest;

/**
 * @author camer
 */
public class LinearSearch 
{
    
    //recieves employee id from array and finds the object record in the file, rs returns
    
    public ReturnSearch linearSearchID(Employee array[], int key)
    {
        
        ReturnSearch rs = new ReturnSearch(-1, -1);
        int position = rs.getPosition();
        int comparisons = rs.getComparisons();
        boolean found = false;
        
        for(Employee i : array)
        {
            rs.setComparisons(comparisons++);
            rs.setPosition(position++);
            
            if(i.getId()== key)//check if x matches the city name
            {
                found = true;
                rs.setPosition(position);
                return rs;
            }
            
            //if key cant be found by the end of the list, return -1 to main
            //this will make the main method print an error
            if(comparisons == array.length-1 && found == false)
            {
                rs.setPosition(-1);
                return rs;
            }
            
        }
        
        return rs;
    }
    
    
}
