/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Input_Output;
import Queue_List.CasualEmployee;
import java.io.*;
/**
 *
 * @author xxped
 */
public class File_Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CasualEmployee casual_out = new CasualEmployee("John", true);
        try{
            FileOutputStream file_out = new FileOutputStream("temp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(file_out);
            out.writeObject(casual_out);
            out.close();
            file_out.close();
            System.out.println("The casual employee has been written to file");
        }
        catch (IOException i){
            i.printStackTrace();
        }
    }
    
}
