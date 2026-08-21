import java.util.*;
public class UsernameLookupManager{
  public static void main(String[] args) {
    ArrayList<String> username= new ArrayList<>();
    username.add("Somnath"); username.add("Rahul"); username.add("Hardik");
    username.add("Virat"); username.add("Dhoni");
    System.out.printf("Do this list contains Rohit? %b%n", username.contains("Rohit"));
    username.set(0, "Successful");
    System.out.println(username);
    username.remove(2);
    System.out.println(username);
  }
}