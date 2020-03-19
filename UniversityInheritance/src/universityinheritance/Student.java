package universityinheritance;

// subclass

import diu.Person;

public class Student extends Person{  // person is a parent   Student is a child

   String Id;
   double cgpa;
   public Student(String s){
       super(s);
    }
   public void setStudentValue(){
    // id
    // cgpa\
       System.out.println("input student info:");
      Id=input.nextLine();
      cgpa=input.nextDouble();
   }
   
   public void print_student_info(){
       System.out.println("Id = " + Id);
       System.out.println("cgpa = " + cgpa);
   }
}
