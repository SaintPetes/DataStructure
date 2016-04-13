/*
 * The purpose of this program is implement a care facility in which patients
 * are sorted in a stack via priority on a 1-10 with 1 being the highest and 10
 * being the lowest. After the patients are sorted and added, a stack of beds
 * is used and assigned to the patients who need it the most. The program then
 * outputs the list of patients along with their bed and location. The programs
 * have been tested for functionality and everything is running smoothly, an
 * excpetion program has been added to make sure the stack does not throw any
 * errors.
 *
 */
package Stacks;

import ADT.Company;
import ADT.HourlyEmployee;
import Queue_List.LinkedList;
import Queue_List.LinkedQueue;
import Queue_List.CasualEmployee;

/**
 *
 * @author Peter Hillar C0416146
 */

/*
* CareFaility is the main class of the program that sorts the stack of
* patients and beds. It also assign the beds to sorted stack of patients
* and extends company for use with the hourly employees created in the previous 
* project.
*/
public class CareFacility extends Company {

    protected HourlyEmployee[] hourlyEmployee;
    protected LinkedList<Bed> bedStack;
    protected String name;
    protected LinkedQueue<CasualEmployee> casusalEmployee;
    protected ArrayStack<Patient> patientStack;
    
    
   /*
    * The default constructor of CareFacility that sets all the elements to null
    */
    public CareFacility() {
        this.name = " ";
        this.patientStack = null;
        this.bedStack = null;
        this.hourlyEmployee = null;
    }
    /*
    * The 2nd constructor of CareFacility, it requires a facility name 
    * and a stack of patients, stack of beds and an array of hourly employees 
    * in order to run the rest of the program requirements it uses the stacks to 
    * sort, and the employees to calculate pay
    */
    public CareFacility(String name, ArrayStack<Patient> patientStack, LinkedList<Bed> bedStack,
            HourlyEmployee[] hourlyEmployee, LinkedQueue<CasualEmployee> casualEmployee) {
        this.patientStack = patientStack;
        this.name = name;
        this.bedStack = bedStack;
        this.hourlyEmployee = hourlyEmployee;
        this.casusalEmployee = casualEmployee;
        sortPatients(patientStack);
    }

    /*
    * The 3rd constructor of CareFacility, it requires a facility name and a 
    * array of hourly employees
    */
    public CareFacility(String name, HourlyEmployee[] hourlyEmployee) {
        this.hourlyEmployee = hourlyEmployee;
        this.name = name;
        this.patientStack = null;
        this.bedStack = null;
        
    }
    /**
    * @param p is a patient that gets taken and added to the stack of patients
    */
    public void addPatient(Patient p){
        add(patientStack, p);
    }

    /**
     *
     * @param p creates two temporary stacks of patients then sorts the patients based
     * on their priority before combing the stacks in a sorted manor
     * @return the sorted stack and allows the patients to be given beds
     */
    public ArrayStack<Patient> sortPatients(ArrayStack<Patient> p) {
          try{
       if (p.isEmpty()) {
        return p;
      }
      Patient temp = p.pop();

      // creates two stacks and sorts them based on priority
      ArrayStack<Patient> left  = new ArrayStack<>();
      ArrayStack<Patient> right = new ArrayStack<>();
      while(!p.isEmpty()) {
        Patient x = p.pop();
        if (x.getPriority() < temp.getPriority()) {
          left.push(x);
        } else {
          right.push(x);
        }
      }
      sortPatients(left);
      sortPatients(right);

      // merges the two stacks together once sorted
      ArrayStack<Patient> tmp = new ArrayStack<>();
      while(!right.isEmpty()) {
        tmp.push(right.pop());
      }
      tmp.push(temp);
      while(!left.isEmpty()) {
        tmp.push(left.pop());
      }
      while(!tmp.isEmpty()) {
        p.push(tmp.pop());
      }
      return p;
    
        }catch(EmptyCollectionException e){
            System.out.println("This action cannont be performed");
        } 
        return p;
    }
    /**
     * 
     * @param pstack is the patient stack that gets checked to see if it is empty
     * then adds patients if it has room
     * @param p the patients created are given a temporary link before being added
     * to the stack
     */
    private void add(ArrayStack<Patient> pstack, Patient p){
        try{
            if(pstack.isEmpty()){
                pstack.push(p);
                return;
            }
            if(pstack.peek().getPriority() > p.getPriority()){
                Patient temp = pstack.pop();
                add(pstack, p);
                pstack.push(temp);
            }else{
                pstack.push(p);
            }
        }catch(EmptyCollectionException e){
            System.out.println("This action cannont be perfomed");
        }
    }
    /**
     * 
     * @param criticalPatient stack checks the priority of the patient then
     * assigns the bed based on it
     * @param openBed stack has all the beds that are open and checks to see
     * which patients require a bed before assigning the open bed to the patient
     */
    public void assignBed(ArrayStack<Patient> criticalPatient, LinkedList<Bed> openBed){
        criticalPatient = patientStack;
        openBed = bedStack;
        try{ 
            if(openBed.isEmpty()){
                return;
            }
            //checks to see what patients have highest priority then 
            //checks to see which beds are still open before assigning them
            if(!criticalPatient.isEmpty()){
                Patient temp = criticalPatient.pop();
                assignBed(criticalPatient,openBed);
                if(temp.getBed() == null && !openBed.isEmpty()){
                    temp.setBed(openBed.removeLast());
                }
                criticalPatient.push(temp);
            }
        }catch(EmptyCollectionException e){
            System.out.println("This action cannont be performed");
        }
        
    }
    /**
     * Gathers the patient stack and allows it to be used the CareFacility constructors
     * @return patientStack to be used
     */
    public ArrayStack<Patient> getPatients(){
        return patientStack;
    }
    /**
     * 
     * @param criticalPatient Checks the criticality of the patient and assigns them
     * an employee if they have a higher priority then other patients
     * @param freeEmployee the employees that are available and able to help care
     * for a patient
     */
    public void assignCasualEmployee(ArrayStack<Patient> criticalPatient, 
            LinkedQueue<CasualEmployee> freeEmployee){
        criticalPatient = patientStack;
        freeEmployee = casusalEmployee;
        try{ 
            if(freeEmployee == null){
                
            }
            else if(freeEmployee.isEmpty()){
                return;
            }
            //checks to see what patients have highest priority then 
            //checks to see which casual employees are still available before assigning them
            if(!criticalPatient.isEmpty()){
                Patient temp = criticalPatient.pop();
                assignCasualEmployee(criticalPatient,freeEmployee);
                if(temp.getCasualEmployee() == null && !freeEmployee.isEmpty()){
                    try {
                        temp.setCasualEmployee(freeEmployee.dequeue());
                    } catch (Queue_List.EmptyCollectionException ex) {
                        System.out.println(ex);
                    }
                }
                criticalPatient.push(temp);
            }
        }catch(EmptyCollectionException e){
            System.out.println(e + "This action cannont be performed");
        }
        
    }
}
