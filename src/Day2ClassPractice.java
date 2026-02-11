import java.util.ArrayList;
import java.util.List;

public class Day2ClassPractice {

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("うなぎ", 3000));
    products.add(new Product("ケーキ", 500));
    products.add(new Product("コーラ", 100));

    for (Product p : products) {
      p.displayInfo();
    }
  }
}
