public class PayPalAccount implements Account {

  public void makePayment(int amount) {
    System.out.println("Payment of $" + amount + " made from PayPal account.");
  }

}
