/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Input_Output;

import Queue_List.CasualEmployee;
import java.io.*;
import Stacks.Patient;
/**
 *
 * @author xxped
 */
public class File_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CasualEmployee casual_in = null;
        try{
            FileInputStream file_in = new FileInputStream("temp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(file_in);
            casual_in = (CasualEmployee)in.readObject();
            in.close();
            file_in.close();
        }
        catch (IOException i){
            i.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();
            return;
        }
        System.out.println(casual_in.getName());
    }
    
}
