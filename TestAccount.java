
import java.util.Scanner;

public class TestAccount{
   public static void main(String[] args){
      Scanner inputObj = new Scanner(System.in);
      // check with the initial inputs    
      String sent_val = "";
      
      while(!sent_val.equals("-1")){ 
         System.out.println("Default myObject Data...");
         Account myObject = new Account(12345, 10000, 2.5); // parametrized constructor initializing account id, initial balance and annualintrestrate
         myObject.withdraw(3500);
         myObject.deposit(500);
         System.out.println(myObject); 
         
         System.out.println("\nmyAccount Data...");
         System.out.print("Account ID: ");
         int accId = inputObj.nextInt();
         System.out.print("Initial balance: ");
         double bal = inputObj.nextDouble();
         System.out.print("Annual interest rate: ");
         double anIR = inputObj.nextDouble();
         Account myAccount = new Account(accId, bal, anIR); // parametrized constructor initializing

         inputObj.nextLine();
         System.out.print("Do you want to withdraw(y/n): ");
         String ansToWithdraw1 = inputObj.nextLine();
         if(ansToWithdraw1.equalsIgnoreCase("y") || ansToWithdraw1.equalsIgnoreCase("yes")){
            System.out.print("Amount you wish to withdarw: ");
            double withAmnt = inputObj.nextDouble();
            myAccount.withdraw(withAmnt);
            inputObj.nextLine();
         }   
         
         System.out.print("Do you want to deposit(y/n): ");
         String ansToDeposit1 = inputObj.nextLine();
         if(ansToDeposit1.equalsIgnoreCase("y") || ansToDeposit1.equalsIgnoreCase("yes")){
            System.out.print("Enter the amount to deposit: ");
            double depAmnt = inputObj.nextDouble();
            myAccount.deposit(depAmnt);
            inputObj.nextLine();
         }
         System.out.println(myAccount);        
  
         System.out.println("\nyourAccount Data...");
         System.out.print("Account ID: ");
         int yaccId = inputObj.nextInt();
         System.out.print("Initial balance: ");
         double ybal = inputObj.nextDouble();
         System.out.print("Annual interest rate: ");
         double yanIR = inputObj.nextDouble();
         inputObj.nextLine();
         
         Account yourAccount = new Account();   // non-arg constructor initialization
         //setup
         yourAccount.setAccountId(yaccId);
         yourAccount.setBalance(ybal);
         yourAccount.setAnnualInterestRate(yanIR);
         
         System.out.print("Do you want to withdraw(y/n): ");
         String ansToWithdraw2 = inputObj.nextLine();
         if(ansToWithdraw2.equalsIgnoreCase("y")){
            System.out.print("Enter the amount you wish to withdarw: ");
            double withAmnt = inputObj.nextDouble();
            yourAccount.withdraw(withAmnt);
            inputObj.nextLine();
         }   
         
         System.out.print("Do you want to deposit(y/n): ");
         String ansToDeposit2 = inputObj.nextLine();
         if(ansToDeposit2.equalsIgnoreCase("y")|| ansToDeposit2.equalsIgnoreCase("yes")){
            System.out.print("Amount to deposit: ");
            double depAmnt = inputObj.nextDouble();
            yourAccount.deposit(depAmnt);
            inputObj.nextLine();
         }
         System.out.println(yourAccount);
         
         // sentinel evaluation
         System.out.print("\nEnter -1 to terminate or anything to re-run: ");
         sent_val = inputObj.nextLine();  
         System.out.println();
  
      }
      inputObj.close();
   }
}

