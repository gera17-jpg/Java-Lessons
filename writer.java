import java.io.FileWriter;
import java.io.IOException;
public class writer {
  public static void main(String[] args)throws IOException {
    // Your code here:
    FileWriter writer = new FileWriter("output.txt");
    String outputText = "You only die once so live life to the fullest";
    writer.write(outputText);
    writer.close();
  }
}
