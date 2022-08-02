package OOP2;

public class MainBankAccount {
    public static void main(String[] args){
        BankAccount dunkyAccount = new BankAccount();
        // Testing...
        dunkyAccount.setNumber("07800900");
        dunkyAccount.setBalance(0.0);
        dunkyAccount.setCustomerName("Dunky Kaligs");
        dunkyAccount.setCustomerEmailAddress("carl@gmail.com");
        dunkyAccount.setCustomerPhoneNumber("+256780xxxxx");

        dunkyAccount.withdrawal(200.0);
        dunkyAccount.deposit(250.0);
        dunkyAccount.withdrawal(100.0);


    }
}
