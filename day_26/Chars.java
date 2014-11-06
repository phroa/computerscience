public class Chars {
  public static void main(String[] args) {
    char x = 'a';
    int y = (x + 3) - 32;
    System.out.println((char)y);

    System.out.println("###");

    String s = "whee it's a string";

    for (char c : s.toCharArray()) {
      System.out.println(c);
    }
    System.out.println("###");

    System.out.println(count(s, 'I') + " \"i\"s in " + s);
  }

  static int count(String s, char c) {
    if (!Character.isLowerCase(c))
      throw new IllegalArgumentException("'" + c +"' really should be lowercase. Try '" + Character.toLowerCase(c) + "'.");
    int f = 0;
    for (char ch : s.toCharArray())
      if (ch == c)
        f++;
    return f;
  }
}
