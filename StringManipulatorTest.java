public class StringManipulatorTest {

    public static void main(String[] args) {

      StringManipulator sMan = new StringManipulator();

      String str = sMan.trimAndConcat("    Hello     ","     World    ");
      System.out.println(str);

      char letter = 'o';
      Integer a = sMan.getIndexOrNull("Coding", letter);
      Integer b = sMan.getIndexOrNull("Hello World", letter);
      Integer c = sMan.getIndexOrNull("Hi", letter);
      System.out.println(a); // 1
      System.out.println(b); // 4
      System.out.println(c); // null

      String word = "Hello";
      String subString = "llo";
      String notSubString = "world";
      Integer d = sMan.getIndexOrNull(word, subString);
      Integer e = sMan.getIndexOrNull(word, notSubString);
      System.out.println(d); // 2
      System.out.println(e); // null

    }
  }
