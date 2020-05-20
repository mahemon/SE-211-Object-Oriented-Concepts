package hellojava;
import java.util.Scanner; 
public class Main {  
    public static void main(String[] args) { 
        int a=5;
        int b=6;
        int add=a+b; 
        System.out.println("sum is: "+add);
        
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        int first= input.nextInt();
        double second = input.nextDouble();
        double res=first+second;
        System.out.println("sum of "+first+" and "+second+" is: "+res);
    }
}
