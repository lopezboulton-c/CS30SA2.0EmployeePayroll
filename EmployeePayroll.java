/********************************************************************
 * Programmer:    Celeste Lopez Boulton
 * Class:  CS30S
 *
 * Assignment: A2.0 Employee Payroll
 *
 * Description: Employee Java class that calculates employee's
 *              hourly wage.
 ***********************************************************************/

// import libraries as needed here

public class EmployeePayroll{
    //*** Class Variables ***

    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();

    private static int nextID = 1000; // used to autogenerate unique id numbers
    private static int MAXHOURS = 40; // max hours until overtime is used
    private static double OVERTIME = 1.5; // rate is multiplied by extra hours
    
    //*** Instance Variables ***
    private int id; // id number of a specific employee
    private int hours; // number of hours worked
    private double wage; // employee's hourly wage

    //*** Constructors ***
    /* a constructor is the only way we
     * can intantiate an object from a clss
     * it does the job of declaring, allocating and
     * instantiating
     */
    //no-arg or default constructor
    // sets the values of the fields to some
    // default value
    public EmployeePayroll(){
        id = getNextID();
        this.hours = hours;
        this.wage = wage;
    }// end no-arg

    // initialized or parametered constructor
    // takes values as parameters and assigns
    // values to the fields of the object
    public EmployeePayroll(int hours, double wage){
        id = getNextID();
        this.hours = hours;
        this.wage = wage;
    }// end param constructor
    
    private int getNextID(){
        return nextID++; // return current id and increment for next use
    }// end get next id

    /*****************************************
     * Description: brief description of the methods purpose
     * 
     * Interface:
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    //*** Getters ***  
    /*****************************************
     * Description: get the unique ID for employee
     * 
     * Interface:
     * 
     * @return       return ID of employee
     * ****************************************/

    public int getID(){
        return this.id;
    } // end get id
    /*****************************************
     * Description: get hours worked by employee
     * 
     * Interface:
     * 
     * @return      return hours worked by employee
     * ****************************************/
    public int getHours(){
        return this.hours;  
    } // end of getHours
    /*****************************************
     * Description: get wage for employee
     * 
     * Interface:
     * 
     * @return      return wage for employee
     * ****************************************/
    public double getWage(){
        return this.wage;
    } // end of getWage

    //*** Setters ***
    public void setHours(int h){
        this.hours = h;
    } // end of setHours
    public void setWage(double w){
       this.wage = w; 
    } // end of setWage

    // *** utility methods ***
    // calculate regular pay
    /*****************************************
     * Description: Calculate the regular pay
     *              given the hours and wage
     * 
     * Interface:
     * 
     * @return      regular pay value
     * ****************************************/
    public double regularPay(){
        return hours * wage;
    } // end of regularPay
    
    // calculate overtime pay
    /*****************************************
     * Description: Calculate the overtime pay
     *              given the overtime hours
     * 
     * Interface:
     * 
     * @return      overtime pay value
     * ****************************************/
    public double overtimePay(){
        return (hours - MAXHOURS) * OVERTIME;
    } // end of overtimePay
    
    // calculate gross pay
    /*****************************************
     * Description: Calculate the gross pay
     *              given the regular and
     *              overtime pay
     * 
     * Interface:
     * 
     * @return      gross pay value
     * ****************************************/
     public double grossPay(){
         return (regularPay() + overtimePay());
     } // end of grossPay
    
} // end of public class
