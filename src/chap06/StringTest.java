package chap06;

public class StringTest {

  public static void main(String[] args) {
    String strVal1 = new String("신민철");
    String strVal2 = strVal1;
    String strVal3 = "신민철";
    String strVal4 = strVal3;

    System.out.println(strVal1 + ", " + strVal2 + ", " + strVal3 + ", " + strVal4);

    if (strVal1 == strVal2) {
      System.out.println("주소가 같음");
    }
    if (strVal1.equals(strVal2)) {
      System.out.println("값이 같음");
    } else {
      System.out.println("값이 다름");
    }

    strVal1 = "신민철";
    strVal3 = "신민국";
    System.out.println(strVal1 + ", " + strVal2 + ", " + strVal3 + ", " + strVal4);

    if (strVal1 == strVal2) {
      System.out.println("주소가 같음");
    } else {
      System.out.println("주소가 다름");
    }
    if (strVal1.equals(strVal2)) {
      System.out.println("값이 같음");
    } else {
      System.out.println("값이 다름");
    }


    MString str1 = new MString("신민철");
    MString str2 = str1;

    System.out.println("*** " + str1.getArg1());
    System.out.println("*** " + str2.getArg1());
    System.out.println("*** " + (str1 == str2));


    str1.setArg1("신문국");
    str1.setValue("신문국");

    System.out.println("*** " + str1.getArg1());
    System.out.println("*** " + str2.getArg1());
    System.out.println("*** " + (str1 == str2));

    MString str3 = new MString();
    System.out.println("*** " + str3.getArg1() + "\n\n\n");


    MString mString1 = MString.getInstance("신민철");
    MString mString2 = mString1;

    System.out.println("*** " + mString1.getArg1());
    System.out.println("*** " + mString2.getArg1());
    System.out.println("*** " + (mString1 == mString2));

    mString1.setValue("신문국");


    System.out.println("*** " + mString1.getArg1());
    System.out.println("*** " + mString2.getArg1());
    System.out.println("*** " + (mString1 == mString2));

    MString mString3 = MString.getInstance();
    System.out.println("*** " + mString3.getArg1() + "\n\n\n");


  }
}
