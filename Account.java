
import java.util.Date;
import java.text.NumberFormat;

public class Account{
   private int accountId;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
   
   // Non-arg constructor
   public Account(){
      this.accountId = 0;
      this.balance = 0.0;
      this.annualInterestRate = 0.0;
      this.dateCreated = new Date();
   }
   
   // Parametrized constructor
   public Account(int accountId, double balance, double annualInterestRate){
      this.accountId = accountId;
      this.balance = balance;
      this.annualInterestRate = annualInterestRate / 100;
      this.dateCreated = new Date();
   }
   
   // set methods
  public void setAccountId(int accountId){
      this.accountId = accountId;
   } 
   
   public void setBalance(double balance){
     this.balance = balance; 
   }
   
   public void setAnnualInterestRate(double annualInterestRate){
      this.annualInterestRate = annualInterestRate / 100;
   }
   
   // get methods
   public int getAccountId(){
      return this.accountId;
   } 
   
   public double getBalance(){
     return this.balance; 
   }
   
   public double getAnnualInterestRate(){
      return this.annualInterestRate;
   }
   
   public Date getDateCreated(){
      return this.dateCreated;
   }
   
   // get monthly 
   public double getMonthlyInterestRate(){
      return this.annualInterestRate / 12;
   }
   
   public double  getMonthlyInterest(){
      return this.balance * getMonthlyInterestRate();
   }

   public void withdraw(double with){
      // If-statement to handle overdrafts
      if(this.balance < with){
         System.out.println("Insufficient fund. Withdrawal failed!");
         System.out.println("Current balance: " + this.balance);
      } else {
         this.balance = this.balance - with;
      } 
   }
   
   public void deposit(double dep){
      if(dep < 0.0){
         System.out.println("Invalid input. Status: failed!");
      } else {
         this.balance = this.balance + dep;
      }
   }
  
   public String toString(){
      NumberFormat fmt = NumberFormat.getPercentInstance();
      fmt.setMaximumFractionDigits(1);
      
      return ("\nAccount ID: \t\t\t\t"       + this.accountId  + 
               "\nAccount Balance: \t\t\t$"  + this.balance    + 
               "\nAnnual Interest Rate: \t"  + fmt.format(getAnnualInterestRate()) + 
               "\nMonthly Interest: \t\t$"   + String.format("%.2f", getMonthlyInterest()) + 
               "\nDate Opened: \t\t\t\t"     + getDateCreated());
   }
}

