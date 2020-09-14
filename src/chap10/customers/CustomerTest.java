package chap10.customers;

public class CustomerTest {

  public static void main(String[] args) {
    Customer customer = new Customer();

    Buy buy = customer;
    buy.buy();

    Sell sell = customer;
    sell.sell();

    if (sell instanceof Customer) {
      Customer customer2 = (Customer) sell;
      customer2.buy();
      customer2.sell();
    }
  }
}
