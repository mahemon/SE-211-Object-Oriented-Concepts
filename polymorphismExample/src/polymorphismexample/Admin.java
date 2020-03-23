
package polymorphismexample;

import diu.Person;
// 10% BA on ySalary
public class Admin extends Person{
    String officeLoacation;
    public Admin(){
     super ("abc");
    }
    @Override
    public void ySalaryCalculation(){   
      double yfSalary= mSalary*12;
      yfSalary=yfSalary+(yfSalary*.05);  // 5%
      System.out.println("yfSalary = " + yfSalary);
    }
    public void setAdmin(){
        System.out.println("inptu admin info: ");
        System.out.println("input officeLoacation:");
        officeLoacation=input.nextLine();
    }
    public void printAdmin(){
        System.out.println("officeLoacation = " + officeLoacation);
    }
}
