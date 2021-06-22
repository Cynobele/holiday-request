package holidayrequest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 * @author camer
 */
public class HRFile 
{
    public Employee[] loadEmps()
    {
        String filePath = "EmployeeData.txt";
        File file = new File(filePath);
        ArrayList<Employee> empData = new ArrayList<>();
        
        if(!file.exists()){
            
            try {
                //Create file
                file.createNewFile(); 
            } catch (IOException ex) { //displays error window if file creation error occurs
                JOptionPane.showMessageDialog(null, "Could not create file!", "Error!", ERROR_MESSAGE);
            }
        }
        
        else{
            try
            {
                //initialise readers
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr); 
                String data = "";
                
                while ( (data=br.readLine())!=null)
                {
                    StringTokenizer st = new StringTokenizer(data, ",");
                    
                    while(st.hasMoreTokens())
                    {
                        //read data and populate objs
                        Employee emp = new Employee();
                        emp.setId(Integer.parseInt(st.nextToken().trim()));
                        emp.setName(st.nextToken().trim());
                        emp.setSurname(st.nextToken().trim());
                        emp.setAge(Integer.parseInt(st.nextToken().trim()));
                        
                        //sets char to uppercase
                        emp.setGender(Character.toUpperCase(st.nextToken().charAt(0)));
                        
                        emp.setHolidaysRem(Integer.parseInt(st.nextToken()));
                        emp.setHolidaysReq(Integer.parseInt(st.nextToken()));
                        
                        //add data to arraylist
                        empData.add(emp);
                    }
                }
                fr.close();
                br.close();
            }
            catch(Exception e)
            {
            //do nothing 
                System.out.println("Could not read file");
            }
            
        }
        
        //create an array of size = (size of empData arraylist)
        Employee arr[] = new Employee[empData.size()];
        
        //set array == empData array list
        arr = empData.toArray(arr);
        
        //populate and return array result using array
        Employee[] result = new Employee[arr.length];
        for(int k = 0; k<arr.length; k++)
        {
            result[k] = arr[k];
        }
        
        return result;
    }
    
    public ArrayList<Employee> loadEmpsList()
    {
        String filePath = "EmployeeData.txt";
        File file = new File(filePath);
        ArrayList<Employee> empData = new ArrayList<>();
        
        if(!file.exists()){
            
            try {
                //Create file
                file.createNewFile(); 
            } catch (IOException ex) { //displays error window if file creation error occurs
                JOptionPane.showMessageDialog(null, "Could not create file!", "Error!", ERROR_MESSAGE);
            }
        }
        
        else{
            try
            {
                //initialise readers
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr); 
                String data = "";
                
                while ( (data=br.readLine())!=null)
                {
                    StringTokenizer st = new StringTokenizer(data, ",");
                    
                    while(st.hasMoreTokens())
                    {
                        //read data and populate objs
                        Employee emp = new Employee();
                        emp.setId(Integer.parseInt(st.nextToken().trim()));
                        emp.setName(st.nextToken().trim());
                        emp.setSurname(st.nextToken().trim());
                        emp.setAge(Integer.parseInt(st.nextToken().trim()));
                        
                        //sets char to uppercase
                        emp.setGender(Character.toUpperCase(st.nextToken().charAt(0)));
                        
                        emp.setHolidaysRem(Integer.parseInt(st.nextToken()));
                        emp.setHolidaysReq(Integer.parseInt(st.nextToken()));
                        
                        //add data to arraylist
                        empData.add(emp);
                    }
                }
                fr.close();
                br.close();
            }
            catch(Exception e)
            {
            //do nothing 
                System.out.println("Could not read file");
            }
        }
        
        return empData;
    }
    
    public void WriteLog(String logName, String logMsg)
    {
        try // this method exports the stack to a txt
        {
            FileWriter writer = new FileWriter(logName,true);
            
            writer.write(logMsg + System.lineSeparator());
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("An IO error has occured when writing.");
        }      
    }  
}
