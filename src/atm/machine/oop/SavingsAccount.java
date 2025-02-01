package atm.machine.oop;

public class SavingsAccount extends Account {

    private double interestrate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestrate = interestRate;
    }

    public double getInteresrate() {
        return this.interestrate;
    }
}
