public class Main {
  public static void main(String[] args) {
    System.out.println(repl("hi", 5));
  }

  public static String repl(String str, int count) {
    if (count <= 0) return "";
    StringBuilder sb = new StringBuilder();
    for (int i=0;i<count;i++)
      sb.append(str);
    return sb.toString();
  }
}
