public class SalesPerson implements Employee {

  private int salary = 50000;

  public void setSalary(int price) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
