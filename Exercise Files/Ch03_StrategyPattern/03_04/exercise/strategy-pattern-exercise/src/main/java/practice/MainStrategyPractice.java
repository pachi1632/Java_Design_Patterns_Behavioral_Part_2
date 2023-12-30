package practice;

public class MainStrategyPractice {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(PaymentMethod.bankAccountPayment, 100);
  }

}
