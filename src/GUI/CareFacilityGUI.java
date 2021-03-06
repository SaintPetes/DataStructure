/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Stacks.Patient;
import Stacks.Bed;
import Stacks.ArrayStack;
import Queue_List.CasualEmployee;
import Queue_List.LinkedList;
import Queue_List.LinkedQueue;

/**
 *
 * @author xxped
 */
public class CareFacilityGUI extends javax.swing.JFrame {

    private String patientP;
    private String patientName;
    private String bedLocal;
    private String newBed;
    private String newEmployee;
    private boolean available = true;
    private String deleteName;
    
    
    
  
    /**
     * Creates new form CareFacilityGUI
     */
    public CareFacilityGUI() {
   
    }
    public CareFacilityGUI(java.awt.Frame parent, boolean modal) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JTabbedPane();
        patientsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientsTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientsName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        releasePatient = new javax.swing.JButton();
        addPatient = new javax.swing.JButton();
        patientPriority = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        deletePatient = new javax.swing.JTextField();
        sortPatients = new javax.swing.JButton();
        searchPatients = new javax.swing.JButton();
        bedsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bedLocation = new javax.swing.JTextField();
        addBed = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bedTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        assignBed = new javax.swing.JButton();
        employeesPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        employeesTextarea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        employeesName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        assignEmployee = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        dismissEmployee = new javax.swing.JButton();
        clockInButton = new javax.swing.JButton();
        overviewPanel = new javax.swing.JPanel();
        companyName = new javax.swing.JLabel();
        overViewLabel = new javax.swing.JLabel();
        activePatients = new javax.swing.JLabel();
        freeBeds = new javax.swing.JLabel();
        freeEmployees = new javax.swing.JLabel();
        patientsCured = new javax.swing.JLabel();
        bedsTaken = new javax.swing.JLabel();
        busyEmployees = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        overViewtextarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientsTextArea.setColumns(20);
        patientsTextArea.setRows(5);
        jScrollPane1.setViewportView(patientsTextArea);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(" Check-in a new Patient");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Release a Patient");

        patientsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Patients Name:");

        jLabel4.setText("Select a Patient to Release");

        releasePatient.setText("Release Patient");
        releasePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releasePatientActionPerformed(evt);
            }
        });

        addPatient.setText("Add Patient");
        addPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientActionPerformed(evt);
            }
        });

        patientPriority.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        patientPriority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientPriorityActionPerformed(evt);
            }
        });

        jLabel12.setText("Patient Priority:");

        deletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientActionPerformed(evt);
            }
        });

        sortPatients.setText("Sort Patients");

        searchPatients.setText("Search Patients");

        javax.swing.GroupLayout patientsPanelLayout = new javax.swing.GroupLayout(patientsPanel);
        patientsPanel.setLayout(patientsPanelLayout);
        patientsPanelLayout.setHorizontalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsPanelLayout.createSequentialGroup()
                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(patientsPanelLayout.createSequentialGroup()
                                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addPatient)
                                    .addComponent(releasePatient))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(patientsPanelLayout.createSequentialGroup()
                                .addComponent(deletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addGap(356, 356, 356))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(searchPatients)
                                    .addComponent(sortPatients))
                                .addGap(60, 60, 60)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patientsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(patientsName)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(88, 88, 88))
        );
        patientsPanelLayout.setVerticalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addPatient)
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(releasePatient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(patientsPanelLayout.createSequentialGroup()
                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(patientsPanelLayout.createSequentialGroup()
                        .addComponent(searchPatients)
                        .addGap(18, 18, 18)
                        .addComponent(sortPatients))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 270, Short.MAX_VALUE))
        );

        mainPanel.addTab("Patients", null, patientsPanel, "");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Add an Available Bed");

        addBed.setText("Add Bed");
        addBed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBedActionPerformed(evt);
            }
        });

        bedTextArea.setColumns(20);
        bedTextArea.setRows(5);
        jScrollPane2.setViewportView(bedTextArea);

        jLabel6.setText("Location of Bed");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Assign Open Bed");

        assignBed.setText("Assign Bed");
        assignBed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bedsPanelLayout = new javax.swing.GroupLayout(bedsPanel);
        bedsPanel.setLayout(bedsPanelLayout);
        bedsPanelLayout.setHorizontalGroup(
            bedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bedsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bedLocation))
                    .addComponent(addBed)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(assignBed))
                .addGap(341, 341, 341)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        bedsPanelLayout.setVerticalGroup(
            bedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bedsPanelLayout.createSequentialGroup()
                .addGroup(bedsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bedsPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bedLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addBed)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(assignBed))
                    .addGroup(bedsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        mainPanel.addTab("Beds", bedsPanel);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Clock in Employee");

        employeesTextarea.setColumns(20);
        employeesTextarea.setRows(5);
        jScrollPane3.setViewportView(employeesTextarea);

        jLabel9.setText("Employee's Name:");

        jLabel10.setText("Assign Employee to Patient");

        assignEmployee.setText("Assign Employee");
        assignEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignEmployeeActionPerformed(evt);
            }
        });

        jLabel11.setText("Dismiss Employee");

        dismissEmployee.setText("Dismiss");

        clockInButton.setText("Clock In");
        clockInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeesPanelLayout = new javax.swing.GroupLayout(employeesPanel);
        employeesPanel.setLayout(employeesPanelLayout);
        employeesPanelLayout.setHorizontalGroup(
            employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeesPanelLayout.createSequentialGroup()
                .addGroup(employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employeesPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(clockInButton)))
                    .addGroup(employeesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(dismissEmployee)
                            .addComponent(assignEmployee)
                            .addComponent(employeesName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        employeesPanelLayout.setVerticalGroup(
            employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeesPanelLayout.createSequentialGroup()
                .addGroup(employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employeesPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(employeesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clockInButton)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(assignEmployee)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(dismissEmployee))
                    .addGroup(employeesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        mainPanel.addTab("Employees", employeesPanel);

        overViewLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        overViewLabel.setText("CareFacility OverView");

        activePatients.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        activePatients.setText("Number of Active Patients:");

        freeBeds.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        freeBeds.setText("Number of Free Beds:");

        freeEmployees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        freeEmployees.setText("Number of Free Employees:");

        patientsCured.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        patientsCured.setText("Patients Cured:");

        bedsTaken.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bedsTaken.setText("Beds Taken:");

        busyEmployees.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        busyEmployees.setText("Busy Employees:");

        updateButton.setText("Update Overview");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        overViewtextarea.setColumns(20);
        overViewtextarea.setRows(5);
        jScrollPane4.setViewportView(overViewtextarea);

        javax.swing.GroupLayout overviewPanelLayout = new javax.swing.GroupLayout(overviewPanel);
        overviewPanel.setLayout(overviewPanelLayout);
        overviewPanelLayout.setHorizontalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(overViewLabel)
                .addGap(253, 253, 253))
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(patientsCured)
                    .addComponent(busyEmployees)
                    .addComponent(bedsTaken)
                    .addComponent(freeEmployees)
                    .addComponent(freeBeds)
                    .addComponent(activePatients)
                    .addComponent(updateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 235, Short.MAX_VALUE))
        );
        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addComponent(activePatients)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(freeBeds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(freeEmployees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bedsTaken)
                        .addGap(13, 13, 13)
                        .addComponent(busyEmployees)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patientsCured))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addContainerGap(465, Short.MAX_VALUE))
        );

        mainPanel.addTab("Main", overviewPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsNameActionPerformed
        patientName = patientsName.getText();
        Patient newP = new Patient(patientName,Integer.parseInt(patientP));
        patientsTextArea.append("The new patient " + patientName + " with priority " +
                patientP + " has been added" + "\n");
        companyName.setText(CFName.cfName.getText());
       
        
        
    }//GEN-LAST:event_patientsNameActionPerformed

    private void releasePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releasePatientActionPerformed
        
    }//GEN-LAST:event_releasePatientActionPerformed

    private void assignBedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBedActionPerformed
        
    }//GEN-LAST:event_assignBedActionPerformed

    private void assignEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignEmployeeActionPerformed
        
    }//GEN-LAST:event_assignEmployeeActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void patientPriorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientPriorityActionPerformed
         patientP = (String)patientPriority.getSelectedItem();
        
        
        
    }//GEN-LAST:event_patientPriorityActionPerformed

    private void addPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientActionPerformed
        patientName = patientsName.getText();
        Patient newP = new Patient(patientName,Integer.parseInt(patientP));
        patientsTextArea.append("The new patient " + patientName + " with priority " +
                patientP + " has been added" + "\n");
    }//GEN-LAST:event_addPatientActionPerformed

    private void addBedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBedActionPerformed
        newBed = bedLocation.getText();
        Bed newB = new Bed(newBed,bedLocal);
        bedTextArea.append("The bed in " + newBed + " has been added" +"\n");
    }//GEN-LAST:event_addBedActionPerformed

    private void clockInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockInButtonActionPerformed
        newEmployee = employeesName.getText();
        CasualEmployee newE = new CasualEmployee(newEmployee,available);
        employeesTextarea.append(newEmployee + " has been punched their time card" +"\n");
    }//GEN-LAST:event_clockInButtonActionPerformed

    private void deletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientActionPerformed
          if (patientName.equals(deleteName)){
              patientsTextArea.append(patientName + " has been released from the facility");
          }
          
    }//GEN-LAST:event_deletePatientActionPerformed

    /**
     */
    public static void newMenu() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CareFacilityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CareFacilityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CareFacilityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CareFacilityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            CareFacilityGUI dialog = new CareFacilityGUI(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
            }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activePatients;
    private javax.swing.JButton addBed;
    private javax.swing.JButton addPatient;
    private javax.swing.JButton assignBed;
    private javax.swing.JButton assignEmployee;
    private javax.swing.JTextField bedLocation;
    private javax.swing.JTextArea bedTextArea;
    private javax.swing.JPanel bedsPanel;
    private javax.swing.JLabel bedsTaken;
    private javax.swing.JLabel busyEmployees;
    private javax.swing.JButton clockInButton;
    public static javax.swing.JLabel companyName;
    private javax.swing.JTextField deletePatient;
    private javax.swing.JButton dismissEmployee;
    private javax.swing.JTextField employeesName;
    private javax.swing.JPanel employeesPanel;
    private javax.swing.JTextArea employeesTextarea;
    private javax.swing.JLabel freeBeds;
    private javax.swing.JLabel freeEmployees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JLabel overViewLabel;
    private javax.swing.JTextArea overViewtextarea;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JComboBox patientPriority;
    private javax.swing.JLabel patientsCured;
    private javax.swing.JTextField patientsName;
    private javax.swing.JPanel patientsPanel;
    private javax.swing.JTextArea patientsTextArea;
    private javax.swing.JButton releasePatient;
    private javax.swing.JButton searchPatients;
    private javax.swing.JButton sortPatients;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    void setText(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
