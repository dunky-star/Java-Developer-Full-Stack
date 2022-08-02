package OOP2;

public class MainBankAccount {
    public static void main(String[] args){
        BankAccount dunkyAccount = new BankAccount("07800900", 0.0, "Dunky Kaligs", "carl@gmail.com", "+256780xxxxx" );
        // Testing...
        System.out.println(dunkyAccount.getCustomerName());
        System.out.println(dunkyAccount.getCustomerEmailAddress());
        System.out.println(dunkyAccount.getCustomerPhoneNumber());
        dunkyAccount.withdrawal(200.0);
        dunkyAccount.deposit(250.0);
        dunkyAccount.withdrawal(100.0);


    }
}
