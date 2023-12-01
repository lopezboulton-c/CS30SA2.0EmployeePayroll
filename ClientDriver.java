import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Celeste Lopez Boulton
 *  Class:          CS30S
 *  Assignment:     Client Code Driver
 * 
 *  Description:    Prints the Employee Payroll information
 * 
 *************************************************************/

public class ClientDriver {
    // a new line character that works on every computer system
    final static String nl = System.lineSeparator();
    final static String delim = "[ ]+";          // delimiter for splitting input records

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String[] tokens = null;         // used to split input records

        // variables
        boolean equalEmployees; // sees if employees' gross pays are equal
        
        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("A2.0: Employee Payroll");
        //Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // ***** print banners *****
        System.out.println(pInfo.getBanner());

        // ***** Using the EmployeePayroll Class *****
        
        /* create/instantiate a couple of circle objects
         * note the difference between the no-arg and parameterd
         * instantiation
         */
            EmployeePayroll employee1 = new EmployeePayroll(30, 15.0);
            EmployeePayroll employee2 = new EmployeePayroll(55, 16.75);
            EmployeePayroll employee3 = new EmployeePayroll();

        // ***** Print Formatted Output *****
            // heading
            System.out.println("*** Employee Payroll Record ***\n");
            
            // use getters and setters
            // employee1
            employee1.getID();
            employee1.getHours();
            employee1.getWage();
            employee1.regularPay();
            employee1.overtimePay();
            employee1.grossPay();
            // print
            System.out.println("Employee #1");
            System.out.println(employee1.toString());
            
            // employee2
            employee2.getID();
            employee2.getHours();
            employee2.getWage();
            employee2.regularPay();
            employee2.overtimePay();
            employee2.grossPay();
            // print
            System.out.println("Employee #2");
            System.out.println(employee2.toString());
            
            // employee3
            employee3.getID();
            employee3.setHours(40);
            employee3.setWage(11.25);
            employee3.regularPay();
            employee3.overtimePay();
            employee3.grossPay();
            // print
            System.out.println("Employee #3");
            System.out.println(employee3.toString());
            
            // test equals method
            // not equal
            equalEmployees = employee1.equals(employee2);
            System.out.println("Employee1 == Employee2: " + equalEmployees);
            // equal
            equalEmployees = employee1.equals(employee3);
            System.out.println("Employee1 == Employee3: " + equalEmployees);
            
            //System.out.format("%s", currency.format(1.5));
            
            double value = 123.45;
            System.out.println(currency.format(value));
            
            
            
        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate