import java.util.ArrayList;

class supers {
  public String toString() {
    return "super";
  }
}
class subs extends supers{
  public String toString() {
    return "sub";
  }
}
public class Generic {

  public static void main(String[] args) {
   tests<supers> ts = new tests<>();
   tests<subs> tts = new tests<>();
   tests<Object> ss = new tests<>();

   ss.add("dddd");
   ss.add(123);
   ts.add(new subs());
  }


}

class tests<T> {
  ArrayList<T> list = new ArrayList<>();
  void add(T item) {
    list.add(item);
  }
}
