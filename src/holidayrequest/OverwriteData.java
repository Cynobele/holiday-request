package holidayrequest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * @author camer
 */
public class OverwriteData 
{
    //this class uses a similar method to the save data method
    //overwrites file with the updated list of employees
    public void overwriteData(ArrayList<Employee> empData, int newData, int position)
    {
        //method for saving records to disc
        //Set file path
        String filePath = "EmployeeData.txt";
        
        //create a new file object, pointing to the file
        File file = new File(filePath);
        
        
        //convert arrlist to arr for use in writer
        //this block from HRFile class
        Employee arr[] = new Employee[empData.size()];
        arr = empData.toArray(arr);    
        //populate and return array result using array
        Employee[] empArr = new Employee[arr.length];
        for(int k = 0; k<arr.length; k++)
        {
            empArr[k] = arr[k];
        }
        
        
        //Check if the file exists in the system
        if(!file.exists()){
            try {
                //Create file
                file.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Could not create file!", "Error!", ERROR_MESSAGE);
            }
        }
        else
        {
            
            try
            {
                //instansiate writers
                FileWriter fw = new FileWriter(filePath);
                BufferedWriter bw = new BufferedWriter(fw);
                for(int i=0; i<empData.size(); i++)
                {
                    //write line
                    bw.write(empArr[i]+System.lineSeparator());
                }
               
               //close writers
                bw.close();
                fw.close();
                
            }
            catch(Exception e)
            {
                //if file could not be updated
                JOptionPane.showMessageDialog(null, "Could not overwrite current file!", "Error!", ERROR_MESSAGE);
            }
        }
    }
    
    
    
}
