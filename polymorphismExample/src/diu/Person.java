package diu;
import java.util.Scanner;
// supper class
public class Person {
    protected String name;
    protected String address;
    protected String univName;
    protected double mSalary;
    
    public Scanner input=new Scanner(System.in);;
    public Person(String des){
      
    }
    
    public void ySalaryCalculation(){
      double ySalary= mSalary*12;
      System.out.println("ySalary = " + ySalary);  
    }
    
    public void SetPersonValue(){
        System.out.println("input person info: ");
        System.out.println("input name:");
        name=input.nextLine();
        System.out.println("input address:");
        address=input.nextLine();
        System.out.println("input univName:");
        univName=input.nextLine();
        System.out.println("input mSalary:");
        mSalary= input.nextDouble();
    }
    
    public void printPerson(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("univName = " + univName);
        System.out.println("mSalary = " + mSalary);
    }
    
    
}
