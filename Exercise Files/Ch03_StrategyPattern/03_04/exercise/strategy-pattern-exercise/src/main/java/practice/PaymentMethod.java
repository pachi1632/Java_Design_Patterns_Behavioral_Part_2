package practice;

public interface PaymentMethod {

    void makePayment(Integer amount);

    PaymentMethod BANK_ACCOUNT_PAYMENT = (Integer amount) -> System.out.println("Payment of $ "+amount+
            " made by Bank Account Payment menthod");

    PaymentMethod PAYPAL_PAYMENT = (Integer amount) -> System.out.println("Payment of $ "+amount+
            " made by Paypal Payment menthod");
}
