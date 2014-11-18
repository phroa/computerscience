public class Quiz {
  public static void main(String[] args) {
    printRange('e', 'g');
    printRange('z', 'a');
    printRange('q', 'r');
  }

  static void printRange(char s, char e) {
    for (char l = s; l <= e; l++) {
      System.out.print(l);
    }
    System.out.println();
  }

}
