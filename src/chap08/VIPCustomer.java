package chap08;

public class VIPCustomer extends Customer{

  protected int agentID;
  double saleRatio;

  public VIPCustomer() {
    setCustomerGrade("VIP");
    bonusRatio = 0.05;
    saleRatio = 0.1;
  }

  public VIPCustomer(int customerID, String customerName, int agentID) {
    super(customerID, customerName);
    setCustomerGrade("VIP");
    bonusRatio = 0.05;
    saleRatio = 0.1;
    this.agentID = agentID;
    System.out.println("VIPCustomer(int, String) 생성자 호출");
  }

  public int getAgentID() {
    return agentID;
  }

  public void setAgentID(int agentID) {
    this.agentID = agentID;
  }

  @Override
  public int calcPoint(int price) {
    bonusPoint += price * bonusRatio;
    return (int) (price - price * saleRatio);
  }

  @Override
  public String showCustomerInfo() {
    return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
  }
}
