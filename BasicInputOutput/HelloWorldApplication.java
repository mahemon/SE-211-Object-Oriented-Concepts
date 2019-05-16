
package helloworldapplication;
import java.util.Scanner;

public class HelloWorldApplication {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter a integer number: ");
       int firstNumber= input.nextInt();
       
       System.out.println("enter a double number: ");
       double secondNumber = input.nextDouble();
       
       input.nextLine();
       
       System.out.println("enter a sentence: ");
       String str= input.nextLine();
        
       
        int a=5;
        int b=6;
        int c=a+b;
       //printf("sum of %d and %d is: %d",a,b ,(a+b));
       System.out.println("sum of "+a+" and "+b+" is: "+(a+b));
       
       if(a>b){
         System.out.println("a is greater");
       }
       else if(a<b){
          System.out.println("b is greater");
       }
       else {
          System.out.println("both is equal");
       }
       
       if(a%2==0)
          System.out.println("even");
       else 
          System.out.println("odd");
       
       int i;
        for ( i = 0; i < 10; i++) {
           System.out.println(" value is: "+i); 
        }
       while(a<10){
           System.out.println(" value ");
           a++;
       }
  
    }
    
}
