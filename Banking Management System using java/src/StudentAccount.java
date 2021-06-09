public class StudentAccount extends SavingAccount {
    String institutionName;

    public StudentAccount(double maximumWithdraw, String memberName, long accountNumber, double accountBalance, double minimumBalance,String institutionName) {
        super(memberName, accountNumber, accountBalance, minimumBalance,maximumWithdraw);
        this.institutionName = institutionName;
    }


    @Override
    public String toString() {
        return "StudentAccount[" +"\n-------------------"+"\nMember Name=" + memberName + "\n-------------------"+"\nAccount Number=" + accountNumber +"\n-------------------"+ "\nAccount Balance=" + accountBalance + "\n-------------------"+"\nMinimum Balance=" + minimumBalance +"\n-------------------"+"Institution Name=" + institutionName + "\n-------------------"+']';
    }

}
