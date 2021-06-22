package holidayrequest;

/**
 * @author camer
 */
public class ReturnSearch 
{
    private int comparisons;
    private int position;
 
    public ReturnSearch(){}//blank constructor
    
    
    //recieves position in file from linear search and can give to any other classes by being called
    public ReturnSearch(int comparisons, int position)
    {
        this.comparisons = comparisons;
        this.position = position;
    }
    
    //getters
    public int getComparisons(){
        return comparisons;
    }

    public int getPosition() {
        return position;
    }

    //setters
    public void setComparisons(int comparisons) {
        this.comparisons = comparisons;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
}