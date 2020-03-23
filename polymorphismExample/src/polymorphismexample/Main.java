package polymorphismexample;

public class Main {
public static void main(String[] args) {
  
    Teacher tea= new Teacher("Fadad");
    tea.SetPersonValue();
    tea.setTeacherValue();
    tea.printPerson();
    tea.printTeacherInfo();
    
    tea.ySalaryCalculation();
    
    Admin ad1= new Admin();
    ad1.SetPersonValue();
    ad1.setAdmin();
    ad1.printPerson();
    ad1.printAdmin();
    ad1.ySalaryCalculation();
  }
}


