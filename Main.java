public class Main {
  // // voidは戻り値なしという意味
  // public static void main(String[] args) {
  //   // それぞれ年齢に関する引数を追加してください
  //   printData("Kate Jones", 27);
  //   printData("John Christopher Smith", 65);
  // }
  // // 年齢に関する引数を受け取れるようにしてください
  // public static void printData(String name, int age) {
  //   System.out.println("私の名前は" + name + "です");
  //   // 「年齢は◯◯歳です」と出力してください
  //   System.out.println("年齢は" + age + "歳です");
  // }
  public static void main(String[] args) {
    
    hello();
    hello("bob");
    // // fullNameメソッドの結果を変数nameに代入してください
    // String name = fullName("Kate", "Jones");
    
    // // printDataの引数を書き換えてください
    // printData(name, 27);
    
    // // こちらは書き換えないでください
    // printData("John Christopher Smith", 65);
    printData(fullName("Kate", "Jones"), 27);
    
    // fullNameメソッドを用いて、printDataの引数を書き換えてください
    printData(fullName("John", "Christopher", "Smith"), 65);
  }
  
  public static void hello(){
    System.out.println("こんにちは世界");
  }
  public static void hello(String name){
    System.out.println("こんにちは" + name +"さん");
  }
  
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }
  
}
