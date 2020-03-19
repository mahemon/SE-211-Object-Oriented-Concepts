package universityinheritance;
// subclass

import diu.Person;

public class Teacher extends Person{

    private String designation;
    private String research;
    
    public Teacher(String a){
     super(a);
    }
    
    public void setTeacherValue(){
        System.out.println("input teacher info:");
        designation=input.nextLine();
      research=input.nextLine();
    }
  
    public void printTeacherInfo(){
        
        System.out.println("designation = " + designation);
        System.out.println("research = " + research);
    }
}
