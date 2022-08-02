package OOP2;

public class VipPersonMain {
    public static void main(String[] args){

        // Testing ...
        VipPerson vipCustomer1 = new VipPerson();
        System.out.println(vipCustomer1.getName());

        VipPerson vipCustomer2 = new VipPerson("Duncan", 2000.5);
        System.out.println(vipCustomer2.getName());

        VipPerson vipCustomer3 = new VipPerson("Duncan", 50000.0, "dunky@gmail.com");
        System.out.println(vipCustomer3.getName());

    }
}
