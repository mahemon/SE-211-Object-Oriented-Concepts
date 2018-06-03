package constructorsexample;
public class Main {
    public static void main(String[] args) {
      Account obj= new Account("Saad", "acc101", 0.0);
      
      double balance=obj.deposit(400);
      System.out.println("After Deposit: "+balance);
      
      balance=obj.withdraw(100);
        System.out.println("After Withdraw: "+balance);
    }    
}
