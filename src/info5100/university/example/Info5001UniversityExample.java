/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.Alumni.Alumni;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.EmployeeDirectory;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.Employers;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");

        Course course = department.newCourse("app eng", "info 5100", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        courseoffer.generatSeats(10);
        
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
//        
        courseload.newSeatAssignment(courseoffer); //register student in class
        SeatAssignment sa = new SeatAssignment();
        sa.assignGradeToStudent("A");
        
        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.println("Total: " + total);
        
        
        //
        System.out.println("Test 1");
        System.out.println(sd.findStudent("0112303").getCourseLoadBySemester("Fall2020"));
        
        CourseLoad cd = sd.findStudent("0112303").getCourseLoadBySemester("Fall2020");
        //cd.newSeatAssignment(courseoffer)

        EmployeeDirectory ed = new EmployeeDirectory();
        ArrayList<Employers> emp = new ArrayList<>();
        Employers em = new Employers();
        em.setEmployerName("Amazon");
        emp.add(em);
        ed.setEmployers(emp);
        
        StudentProfile sp = sd.findStudent("0112303");
       // System.out.println("");
        Alumni al = new Alumni();
        al.setStudentProfile(sp);
        al.setGradutationYear(2020);
        al.setEmp(em);
        al.setPosition("SDE");
        
        
        System.out.println("SS "+ al.getStudentProfile().getPerson().getPersonId());
        
        
        
        
    }
    public void test1(){
        Department department = new Department("Information Systems");

        Course course = department.newCourse("app eng", "info 5100", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        courseoffer.generatSeats(10);
        
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
//        
        courseload.newSeatAssignment(courseoffer); //register student in class
        SeatAssignment sa = new SeatAssignment();
        sa.assignGradeToStudent("A");
        
        EmployeeDirectory ed = new EmployeeDirectory();
        ArrayList<Employers> emp = new ArrayList<>();
        Employers em = new Employers();
        em.setEmployerName("Amazon");
        emp.add(em);
        ed.setEmployers(emp);
       
        StudentProfile sp = sd.findStudent("0112303");
       // System.out.println("");
        Alumni al = new Alumni();
        al.setStudentProfile(sp);
        al.setGradutationYear(2020);
        al.setEmp(em);
        al.setPosition("SDE");
        HashMap<String, Alumni> map = new HashMap<>();
        map.put("0112303", al);
        al.setAlumniDir(map);
        
        
        
    }

}
