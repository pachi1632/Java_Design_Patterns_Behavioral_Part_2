package practice;

public class Customer {

  public void makePayment(PaymentMethod paymentMethod, Integer amount) {
    paymentMethod.makePayment(amount);
  }

}
