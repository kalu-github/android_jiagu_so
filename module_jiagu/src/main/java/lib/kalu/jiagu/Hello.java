package lib.kalu.jiagu;
public class Hello {

  static {
    System.loadLibrary("native");
  }

  public static native String say();
}
