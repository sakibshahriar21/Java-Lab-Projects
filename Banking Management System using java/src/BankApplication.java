import java.util.*;
public class BankApplication {

    public static void main(String args[]){
   
        BankAccount b=null;
        Scanner sc=new Scanner(System.in);
        int choice;
        String name = null;
        System.out.println("========*****========");
        System.out.println("Welcome To Royal Bank.");
        System.out.println("-------------------");
        System.out.println("Choose your option");
        System.out.println("-------------------");
        System.out.println("1.Savings Accounts.");
        System.out.println("2.Current Accounts.");
        System.out.println("3.Student Account.");
        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
        if(choice==1){
            System.out.println("-------------------");
            System.out.print("Enter Your Name: ");
            name=sc.next();
            System.out.println("-------------------");
            System.out.print("Enter Initial Balance: ");
            double balance=sc.nextDouble();
            System.out.println("-------------------");
            System.out.print("Enter Maximum Withdraw Balance: ");
            double withdraw=sc.nextDouble();
            System.out.println("-------------------");
            long a=Math.round(Math.random() * 100000);
            b=new SavingAccount(name,a,balance,balance,withdraw);
          
        }
        else if(choice==2){
            System.out.println("-------------------");
            System.out.print("Enter Your Name: ");
            name=sc.next();
            System.out.println("-------------------");
            System.out.print("Enter Initial Balance: ");
            double balance=sc.nextDouble();
            System.out.println("-------------------");
            System.out.print("Enter Trade Licence Number: ");
            String tradeNum=sc.next();
            System.out.println("-------------------");
            long a=Math.round(Math.random() * 100000);
            b=new CurrentAccount(name,a,balance,balance,tradeNum);
    
        }
        else if(choice==3){
            System.out.println("-------------------");
            System.out.print("Enter Your Name: ");
            name=sc.next();
            System.out.println("-------------------");
            System.out.print("Enter Initial Balance: ");
            double balance=sc.nextDouble();
            System.out.println("-------------------");
            System.out.print("Enter Trade Institution Name: ");
            String institution=sc.next();
            System.out.println("-------------------");
            long a=Math.round(Math.random() * 100000);
            b=new CurrentAccount(name,a,balance,balance,institution);
  
        }
        
        System.out.println("Welcome To Royal Bank Mr/Miss: "+name);
        while(true){
        int cho;
            System.out.println("-------------------");
            System.out.println("What Would You Like To Do....");
            System.out.println("1.Deposit\n2.Withdraw\n3.See your Balance\n4.See Profile\n0.Exit");
            System.out.print("Enter Your Choice: ");
        cho=sc.nextInt();
        if(cho==1){
            System.out.println("-------------------");
            System.out.print("Enter Amount To Deposit: ");
	    double amount=sc.nextDouble();
            
            b.deposite(amount);
        }
        else if(cho==2){
            System.out.println("-------------------");
            System.out.print("Enter Amount To Withdraw : ");
	    double amount=sc.nextDouble();
            b.withdraw(amount);
        }
        else if(cho==3){
            System.out.println("-------------------");
            System.out.println("Your Current Balance is: "+b.getAccountBalance());
        }
        else if(cho==4){
            System.out.println(b);
        }
        else if(cho==0){
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input!");
            continue;
        }
     }
   }
}