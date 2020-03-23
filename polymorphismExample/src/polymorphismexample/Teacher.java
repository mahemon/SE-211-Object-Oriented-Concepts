package polymorphismexample;
// subclass

import diu.Person;
// 5% BA on ySalary
public class Teacher extends Person{

    private String designation;
    private String research;
    
    public Teacher(String a){
     super(a);
    }
    
    @Override
    public void ySalaryCalculation(){   
      double yfSalary= mSalary*12;
      yfSalary=yfSalary+(yfSalary*.05);  // 5%
      System.out.println("yfSalary = " + yfSalary);
    }
    public void setTeacherValue(){
        System.out.println("input teacher info:");
        System.out.println("input designation:");
        designation=input.nextLine();
        System.out.println("input research:");
        research=input.nextLine();
    }
  
    public void printTeacherInfo(){
        
        System.out.println("designation = " + designation);
        System.out.println("research = " + research);

    }
}
