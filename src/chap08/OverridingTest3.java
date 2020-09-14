package chap08;

public class OverridingTest3 {

  public static void main(String[] args) {

    Customer customerLee = new Customer();
    VIPCustomer customerKim = new VIPCustomer();
    Customer vc = new VIPCustomer();

    System.out.println(customerLee.calcPoint(10000));
    System.out.println(customerKim.calcPoint(10000));
    System.out.println(vc.calcPoint(10000));


  }
}
