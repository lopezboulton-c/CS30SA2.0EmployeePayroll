import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Celeste Lopez Boulton
 *  Class:          CS30S
 * 
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

        // ***** objects *****
        ProgramInfo pInfo = new ProgramInfo("A2.0: Employee Payroll");
        
        //Scanner scanner = new Scanner(System.in);
        // ***** print banners *****

        System.out.println(pInfo.getBanner());

        // ***** Using the Circle Class *****
        
        /* create/instantiate a couple of circle objects
         * note the difference between the no-arg and parameterd
         * instantiation
         */
        
        

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate