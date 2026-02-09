import java.util.ArrayList;
import java.util.List;

public class Day1ListPractice {

  public static void main(String[] args) {

    List<String> stringList = new ArrayList<>();
    stringList.add("うなぎ");
    stringList.add("ケーキ");
    stringList.add("コーラ");
    for (String string : stringList) {
      System.out.println(string);

    }
  }
}