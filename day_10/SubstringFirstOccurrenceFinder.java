import java.util.*;
public class SubstringFirstOccurrenceFinder{
  public static void main(String[] args) {
    String text= "My name is Somnath Saha", word= "is";
    System.out.print(findSubstring(text, word));
  }
  static int findSubstring(String text, String word){
    if (text.contains(word)){
      for (char c:text.toCharArray()){
        if (word.charAt(0)==c){
          return text.indexOf(c);
        }
      }
    }
    return -1;
  }
}