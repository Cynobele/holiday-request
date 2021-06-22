package holidayrequest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * @author camer
 */
public class DeleteEmployee {
    
    public boolean deleteEmp(String key){
        
        //import array list for use in validation
        ArrayList<Employee> emp = new ArrayList<>();
        HRFile hrf = new HRFile();
        emp = hrf.loadEmpsList();
        
        //find file paths
        File file = new File("EmployeeData.txt");
        File tempFile = new File("TempEmp.txt");
        boolean success = false;
        boolean found = false; //the id exists in the file
        int lines = 0;
        String oldContent;

        if(!tempFile.exists()){
            try {
                //Create file
                tempFile.createNewFile();
            } 
            catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Could not create file!", "Error!", ERROR_MESSAGE);
            }
        }
        else{
            try{
                //file = original file
                //tempfile = file for storing data - data that was to be deleted
                BufferedReader br = new BufferedReader(new FileReader(file));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
                
                //while there are more lines to be read
                while((oldContent = br.readLine()) != null)
                {
                    lines++;
                    //if the line starts with the key
                    //id will always be the first thing on a line so this should work
                    if(oldContent.startsWith(key))
                    {
                        found = true;
                        //breaks this loop and continues with the next
                        continue;
                    }
                    //write line
                    bw.write(oldContent);
                    bw.flush();
                    bw.newLine();
                }
                if(lines >= emp.size() && found == false)
                {
                   success = false; 
                }
                else
                {
                    success = true;
                }
                br.close();
                bw.close();
                
                
                //delete original file
                file.delete();
                
                //rename tempfile to same name as old file
                tempFile.renameTo(file);  
            }
            catch(Exception e){success = false;}
        }
        
        return success;
    }
}
