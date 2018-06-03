package constructorsexample;
public class Account {
  private String name;
  private String AccID;
  private double balance;
  
  public Account(String n, String id, double b){
    name=n;
    AccID=id;
    balance=b;
  }
  public double deposit(double d){
    balance+=d;
    return balance;
  }
  public double withdraw(double w){
   if(w>=balance)
       balance-=w;
   return balance;
  }
}
