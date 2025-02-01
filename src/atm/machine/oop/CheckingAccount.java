package atm.machine.oop;

public class CheckingAccount extends Account {

    private double interestrate;

    public CheckingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
    }

    public double getInterestrate() {
        return this.interestrate;
    }
}
