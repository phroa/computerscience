import java.io.File;

public class FileInfo {
  public static void main(String[] args) {
    File hamlet = new File("../reference_files/hamlet.txt");

    System.out.println("exists? " + hamlet.exists());
    System.out.println("canRead? " + hamlet.canRead());
    System.out.println("length? " + hamlet.length());
    System.out.println("absolute path? " + hamlet.getAbsolutePath());

  }
}
