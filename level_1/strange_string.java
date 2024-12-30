public class strange_string {
  public String solution(String s) {

    StringBuilder builder = new StringBuilder();
    boolean toUpper = true;

    for (char c : s.toCharArray()) {
      if (!Character.isAlphabetic(c)) { // 공백
        builder.append(c);
        toUpper = true;
      } else {
        if (toUpper) {
          builder.append(Character.toUpperCase(c));
        } else {
          builder.append(Character.toLowerCase(c));
        }

        toUpper = !toUpper;
      }

    }
    return builder.toString();
  }
}