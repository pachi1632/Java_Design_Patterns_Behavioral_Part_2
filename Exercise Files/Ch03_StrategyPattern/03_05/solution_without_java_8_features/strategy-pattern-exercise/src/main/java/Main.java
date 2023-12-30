public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    BankAccount bankAccount = new BankAccount();
    customer.makePayment(bankAccount, 100);
  }

}
