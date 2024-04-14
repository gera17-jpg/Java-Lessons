public class Util {
  public static void printBag(Bag<?> bag) {
    System.out.println(bag.toString()); 
  }
}
Bag<String> myBag1 = new Bag("Hello");
Bag<Integer> myBag2 = new Bag(23);
Util.printBag(myBag1);  // Hello
Util.printBag(myBag2);  // 23
