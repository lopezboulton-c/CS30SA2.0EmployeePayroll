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
    private final double PI = 3.14159;
    
    private static int nextID = 1000; // used to autogenerate unique id numbers

    //*** Instance Variables ***
    private double radius;
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
        this.radius = 0.0;
        id = getNextID();
        this.hours = hours;
        this.wage = wage;
    }// end no-arg

    // initialized or parametered constructor
    // takes values as parameters and assigns
    // values to the fields of the object
    public EmployeePayroll(double radius, int hours, double wage){
        this.radius = radius;
        id = getNextID();
        this.hours = hours;
        this.wage = wage;
    }// end param constructor
    
    private int getNextID(){
        return nextID++;            // return current id and increment for next use
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
     * Description: get the radius of the circle
     * 
     * Interface:
     * 
     * @return       double: radius of the circle
     * ****************************************/
    public double getRadius(){
        return this.radius;
    }//end get radius
    
    public int getID(){
        return this.id;
    }// end get id

    //*** Setters ***
    public void setRadius(double r){
        this.radius = r;
    }// end set radius

    // *** utility methods ***

    // calculate diameter
    /*****************************************
     * Description: Calculate the diameter of the circel with radius r
     * 
     * Interface:
     * 
     * @return       diameter of the circle: double
     * ****************************************/
    public double getDiameter(){
        return this.radius * 2;
    }// end diameter

    // calculate circumference
    /*****************************************
     * Description: Calculate the circumference of the circel with radius r
     * 
     * Interface:
     * 
     * @return       circumference of the circle: double
     * ****************************************/
    public double getCircumference(){
        return this.radius * 2 * PI;
    }// end circumference

    // calculate area
    /*****************************************
     * Description: Calculate the area of the circel with radius r
     * 
     * Interface:
     * 
     * @return       area of the circle: double
     * ****************************************/
    public double getArea(){
        return this.radius * this.radius * PI;
    }// end area

    // Overriding methods
    public boolean equals(EmployeePayroll oc){
        boolean equal;

        equal = this.radius == oc.getRadius();

        return equal;
    }// end equals

    @Override
    public String toString(){
        String st;
        st = "Circle ID: " + getID() + nl;
        st += "Radius: " + String.format("%8.3f",this.radius) + nl;
        st += "Diameter: " + String.format("%8.3f",this.getDiameter()) + nl;
        st += "Circumference: " + String.format("%8.3f",this.getCircumference()) + nl;
        st += "Area: " + String.format("%8.3f",this.getArea()) + nl;

        return st;
    }// end toString
} // end of public class
