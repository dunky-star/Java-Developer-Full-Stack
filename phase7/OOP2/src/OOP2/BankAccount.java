/**
 * Written by: Geoffrey Duncan O. Tweet: dunky2012, Insta: KaligsXcross
 * Create a new class for a bank account.
 * Create fields for the account number, balance, customer name, email and phone number.
 * Create getter and setter for each field. create two additional methods:
 * 1. To allow the customer to deposit funds (this should increment the balance field).
 * 2. To allow the customer to withdraw funds (this should deduct from the balance field).
 * But not allow the withdrawal to complete if there is insufficient bal.
 */
package OOP2;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance = " + this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <= 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

}
