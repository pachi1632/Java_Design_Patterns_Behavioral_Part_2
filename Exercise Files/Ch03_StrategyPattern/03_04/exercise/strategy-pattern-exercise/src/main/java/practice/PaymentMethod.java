package practice;

public interface PaymentMethod {

    void makePayment(Integer amount);

    PaymentMethod bankAccountPayment = (Integer amount) -> System.out.println("Payment of $ "+amount+
            " made by Bank Account Payment menthod");

    PaymentMethod paypalPayment = (Integer amount) -> System.out.println("Payment of $ "+amount+
            " made by Paypal Payment menthod");
}
