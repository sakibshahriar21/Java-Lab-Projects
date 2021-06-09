public class SavingAccount extends BankAccount{
    
    	double interest=0.05;
	double maximumWithdraw;

    public SavingAccount(String memberName, long accountNumber, double accountBalance, double minimumBalance,double maximumWithdraw) {
        super(memberName, accountNumber, accountBalance, minimumBalance);
        this.maximumWithdraw = maximumWithdraw;
    }
    
    double getNetBalance(){
        double netBalance=accountBalance;
        netBalance=netBalance+(netBalance*interest);
        return netBalance;
    }

    @Override
    void withdraw(double ammount) {
        
        if(ammount<=maximumWithdraw){
            accountBalance-=ammount;
        }
        else{
            System.out.println("Insufficient Balance!");
        }
        
    }
    @Override
    public String toString() {
        return "SavingAccount[" +"\n-------------------"+"\nMember Name=" + memberName +"\n-------------------"+ "\nAccount Number=" + accountNumber +"\n-------------------"+ "\nAccount Balance=" + accountBalance + "\n-------------------"+"\nMinimum Balance=" + minimumBalance +"\n-------------------"+"\nInterest=" + interest + "\n-------------------"+"\nMaximum Withdraw=" + maximumWithdraw + "\n-------------------"+']';
    }

}
