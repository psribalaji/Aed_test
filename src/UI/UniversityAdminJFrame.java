/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import TestData.TestData;
import helper.Helper;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Department.Department;
import info5100.university.example.Department.DepartmentDirectory;
import info5100.university.example.Info5001UniversityExample;
import info5100.university.example.Persona.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author psrib
 */
public class UniversityAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UniversityAdminJFrame
     */
    Info5001UniversityExample uni = new Info5001UniversityExample();
            TestData testData = TestData.getInstance();

    public UniversityAdminJFrame() {
        initComponents();
        testData.test2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Get Department List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Student Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(372, 372, 372)
                            .addComponent(jLabel1))))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124)
                .addComponent(jButton2)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       getDepartmentList();
        
     }
    
    public void getDepartmentList(){
         DepartmentDirectory department = testData.getDd();
        ArrayList<Department> departmentlist = department.getDd();
        for(Department d : departmentlist)
        {
            System.out.println(d.getName());
//            Helper helper = new Helper();
//            List<Course> course = helper.getCourseOffer(d, "Fall2020");
//            for(Course c : course)
//            {
//                System.out.println(c.getName());
//            }
//            List<Person> list = helper.getStudent(d);
//            for(Person p : list)
//            {
//                System.out.println(p.getPersonId());
//            }
            
           
           getCourseOfferedByDepartment(d); 
    }
    
        
        
//        String d1 ="Information Systems";
//        String course ="app eng";
//       
//        for(Department d : departmentlist)
//        {
//            //System.out.println(d.getName());
//            Helper helper = new Helper();
//            List<CourseOffer> course1 = helper.getCourseOfferList(d, "Fall2020");
//            for(CourseOffer c : course1)
//            {
//                    if(c.getCourse().getName().equals(course))
//                    {
//                        helper.addStudent(d, "test", "1234", "Fall2020",c );
//                        
//                    }
//            }
//        }
//        for(Department d : departmentlist)
//        {
//            System.out.println(d.getName());
//            Helper helper = new Helper();
//            List<Course> course2 = helper.getCourseOffer(d, "Fall2020");
//            for(Course c : course2)
//            {
//                System.out.println(c.getName());
//            }
//            List<Person> list = helper.getStudent(d);
//            for(Person p : list)
//            {
//                System.out.println(p.getPersonId());
//            }
//        }
            
            
            
        
        
      //  System.out.println("DD "+ uni.getDd().toString());
//        ArrayList<DepartmentDirectory> d = uni.getDd();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public List getStudentsByDepartmentName(Department dpt){
            Helper helper = new Helper();
            List<Person> p = helper.getStudent(dpt);
//            for(Course c : course)
//            {
//                System.out.println(c.getName());
//            }
//            List<Person> list = helper.getStudent(d);
//            for(Person p : list)
//            {
//                System.out.println(p.getPersonId());
//            }
            System.out.println("PP "+ p.get(0).getPersonId());
            return p;
    }
    
    public List getCourseOfferedByDepartment(Department d){
        return new Helper().getCourseOfferList(d, "Fall2020");
    }
    
    public void addStudent(Department d, String sname, String sid, String sem, CourseOffer co){
        
        new Helper().addStudent(d, sname, sid, sem, co);
    }
    
    public void addProf(Department d, String profName, String pid, String sem, CourseOffer co){
        
        new Helper().addProfessor(d, profName, pid, sem, co);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UniversityAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversityAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversityAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversityAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniversityAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
