package holidayrequest;

/**
 * @author camer
 */
public class Employee 
{
    private int id;
    private String name;
    private String surname;
    private int age;
    private char gender;
    private int holidaysRem;
    private int holidaysReq;

    public Employee(int id, String name, String surname, int age, char gender, int holidaysRem, int holidaysReq) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.holidaysRem = holidaysRem;
        this.holidaysReq = holidaysReq;
    }

        public Employee() 
    {/*blank constructor*/}
        
        
        //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getHolidaysRem() {
        return holidaysRem;
    }

    public int getHolidaysReq() {
        return holidaysReq;
    }

    
        //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHolidaysRem(int holidaysRem) {
        this.holidaysRem = holidaysRem;
    }

    public void setHolidaysReq(int holidaysReq) {
        this.holidaysReq = holidaysReq;
    }

    @Override
    public String toString() {
        return id+","+name+","+surname+","+age+","+gender+","+holidaysRem+","+holidaysReq+",";
    }

    public String approveMsg(){
        //msg for request functionality if holidays are approved
        
        String msg = "Holidays Approved. Employee record updated.\nID:"+id+", "+name+" "+surname+", Age:"+age+", Gender:"+gender+", Remaining Hols:"+holidaysRem+", Requested Hols: "+holidaysReq;
        return msg;
    }
    
    public String showRecord(){
        //msg for search functionality if employee is found
        String msg = "Employee found!\n"
                + "ID: "+id+", Name: "+name+ " "+surname+", Age: "+age
                +", Gender: "+gender+", RemainingHols: "+holidaysRem+", RequestedHols: "+holidaysReq;
        
        return msg;
    }
}
