public class Product {

  // ① フィールド：まずはここで「箱」だけ用意します（中身は空っぽでOK）
  String name;
  int price;

  // ② コンストラクタ：箱に中身を入れるための入り口です
  // （書かれているコード、バッチリ合っています！）
  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // ③ メソッド：ここにステップ3を書きます
  // 「戻り値なし(void)」で「displayInfo」という名前で作ります
  public void displayInfo() {
    // ここに System.out.println... を書く
    System.out.println("商品名:" + name + "/価格:" + price + "円");
  }
}
