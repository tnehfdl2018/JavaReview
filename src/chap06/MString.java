package chap06;

public class MString {

  public String arg1;

  public MString(String value) {
    this.arg1 = value;
  }

  public MString() {

  }

  public String getArg1() {
    return arg1;
  }

  public void setArg1(String arg1) {
    this.arg1 = arg1;
  }

  public void setValue(String value) {
    synchronized (this) {
      this.arg1 = value;
    }
  }



  private static MString instance;

  public static MString getInstance(String arg1){
    if (instance == null) {
      synchronized (MString.class){
        if (instance == null) {
          instance = new MString(arg1);
        }
      }
    }
    return instance;
  }


  public static MString getInstance(){
    if (instance == null) {
      synchronized (MString.class){
        if (instance == null) {
          instance = new MString();
        }
      }
    }
    return instance;
  }


}
