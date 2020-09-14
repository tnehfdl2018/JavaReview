package chap10.customers;

public class Customer implements Sell, Buy {
  @Override
  public void buy() {
    System.out.println("판매하기");

  }

  @Override
  public void sell() {
    System.out.println("구매하기");
  }
}
