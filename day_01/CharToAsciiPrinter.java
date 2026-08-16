class CharToAsciiPrinter{
  public static void main(String[] args) {
    String hin= "सोमनाथ";
    for (int i = 0; i < hin.length(); i++) {
    char ch = hin.charAt(i);
    System.out.printf("Unicode of '%c': %d%n", ch, (int)ch);
    }
  }
}