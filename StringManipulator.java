// java.lang.String is automatically imported
public class StringManipulator {

  public String trimAndConcat(String str_a, String str_b) {

    String A = str_a.trim();
    String B = str_b.trim();
    return A + B;
  }

  public Integer getIndexOrNull(String str, char ch) {

    int result = str.indexOf(ch);
    if (result == -1) return null;
    return result;
  }

  public Integer getIndexOrNull(String str_a, String str_b) {
    int result = str_a.indexOf(str_b);
    if (result == -1) return null;
    return result;
  }

  public String concatSubstring(String str, int begin, int end, String target_str) {
    return "";
  }
}
