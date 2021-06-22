package holidayrequest;

/**
 * @author camer
 */
public class HolidayRequestLog {
    
    public String fileName(String empName){
        
        //this function should create a new title for each employee txt
        
        String fileName;
        String end = "HolidayLog.txt";
        
        fileName = empName.concat(end);
        
        return fileName;
    }
    
    public String msgLog(String empName, int empID, int req, boolean approved){
        
        //this function should create an approriate message for each file
        
        String msg, status;
        if(approved == true)
        {
            status = "Approved";
        }
        else
        {
            status = "Denied";
        }
        
        msg="ID:"+empID+" "+empName+" - Requested "+req+" holidays - Status: "+status;
        
        return msg;
    }
    
    
}
