package com.edureka.interface_demo.collections;

public class Gateway {

    public static void main(String[] args) {
        Pay pay = (customer, merchant) -> System.out.println("Transfering money with Cash "+customer + " merchant "+merchant);
        pay.transferMoney("Suresh", "Vinay");
    }
}

class GooglePay implements Pay{

    @Override
    public void transferMoney(String customer, String merchant) {
        System.out.println("Transfering money with Google : "+ customer+ " merchant : "+merchant);
    }
}
class Stripe implements Pay{

    @Override
    public void transferMoney(String customer, String merchant) {
        System.out.println("Transfering money with Stripe : "+ customer+ " merchant : "+merchant);
    }
}
class PayPal implements Pay{

    @Override
    public void transferMoney(String customer, String merchant) {
        System.out.println("Transfering money with PayPal : "+ customer+ " merchant : "+merchant);
    }
}
class PayTm implements Pay{

    @Override
    public void transferMoney(String customer, String merchant) {
        System.out.println("Transfering money with PayTm : "+ customer+ " merchant : "+merchant);
    }
}