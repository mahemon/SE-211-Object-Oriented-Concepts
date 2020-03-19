package universityinheritance;

public class Main {
public static void main(String[] args) {
    Student std1 = new Student("Abir");
    std1.SetPersonValue();
    std1.setStudentValue();
    
    std1.printPerson();
    std1.print_student_info();
    

    Teacher tea= new Teacher("Fadad");
    tea.SetPersonValue();
    tea.setTeacherValue();
    
    tea.printPerson();
    tea.printTeacherInfo();
    
  }  
}
