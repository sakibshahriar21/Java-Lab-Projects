import java.util.*;
public class BankAccount {
    
    String memberName;
    long accountNumber;
    double accountBalance;
    double minimumBalance;
    

    public BankAccount(String memberName,long accountNumber,double accountBalance,double minimumBalance){
        this.memberName=memberName;
        this.accountBalance=accountBalance;
        this.minimumBalance=minimumBalance;
        this.accountNumber=accountNumber;
}
    void deposite(double ammount){
        accountBalance+=ammount;
    }
    void withdraw(double ammount){
        
        if (ammount<=accountBalance){
            accountBalance-=ammount;
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }


    @Override
    public String toString() {
        return "Bank Account[" + "\n-------------------"+"\nMember Name=" + memberName + "\n-------------------"+"\nAccount Number=" + accountNumber +"\n-------------------"+ "\nAccount Balance=" + accountBalance +"\n-------------------"+ "\nMinimum Balance=" + minimumBalance + "\n-------------------"+']';
    }
    
}
