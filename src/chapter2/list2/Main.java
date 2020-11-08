package chapter2.list2;

public class Main {
  public static void main(String... args) {
    String s = "abc";
    // 以下4行はどれでも、StringIndexOutOfBoundsException
    s.charAt(-1);
    s.charAt(3);
    s.substring(1, 3);
    s.substring(2, 1);
  }
}
