public class Account{
  int balance;
  Account(int balance){
    this.balance= balance;
  }
  void response(){
    System.out.print(balance);
  }
}
public class AccountBalanceUpdater{
  public static void main(String[] args) {
    Account acc= new Account(3000);
    deposit(acc, 1000);
    System.out.println(acc.balance);
    acc.response();
  }
  static void deposit(Account acc, int amount){
    acc.balance+=amount;
  }
}