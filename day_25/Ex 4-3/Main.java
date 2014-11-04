public class Main {
  public static void main(String[] args) {
    System.out.println(season(9, 14));
  }

  public static String season(int month, int day) {
    if ((month<1||month>12)||(day<1||day>31)) return "";
    switch (month) {
      case 1:
      case 2:
        return "winter";
      case 3 :
        if (day < 15)
          return "winter";
        else
          return "spring";
      case 4:
      case 5:
        return "spring";
      case 6:
        if (day < 15)
          return "spring";
        else
          return "summer";
      case 7:
      case 8:
        return "summer";
      case 9:
        if (day < 15)
          return "summer";
        else
          return "fall";
      case 10:
      case 11:
        return "fall";
      case 12:
        if (day < 15)
          return "fall";
        else
          return "winter";
    }
    return "uh, no.";
  }
}
