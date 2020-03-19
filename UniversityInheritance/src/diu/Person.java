package diu;

import java.util.Scanner;
// supper class
public class Person {
    protected String name;
    protected String address;
    protected String univName;
    
    public Scanner input;
    public Person(String des){
     input=new Scanner(System.in);
    }
    public void SetPersonValue(){
        //name
        //address
        System.out.println("input person info: ");
        name=input.nextLine();
        address=input.nextLine();
    }
    public void printPerson(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }
    
}
