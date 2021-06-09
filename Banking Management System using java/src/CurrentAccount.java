public class CurrentAccount extends BankAccount{
    String tradeLicenceNumber;

    public CurrentAccount(String memberName, long accountNumber, double accountBalance, double minimumBalance,String tradeLicenceNumber) {
        super(memberName, accountNumber, accountBalance, minimumBalance);
        this.tradeLicenceNumber = tradeLicenceNumber;
    }


    @Override
    public String toString() {
        return "CurrentAccount[" +"\n-------------------"+"\nMember Name=" + memberName +"\n-------------------"+ "\nAccount Number=" + accountNumber +"\n-------------------"+ "\nAccount Balance=" + accountBalance +"\n-------------------"+ "\nMinimum Balance=" + minimumBalance + "\n-------------------"+"\nTrade LicenceNumber=" + tradeLicenceNumber +"\n-------------------"+ '}';
    }

}
