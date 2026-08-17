class StringEqualityChecker{
  public static void main(String[] args) {
    String a= "Kunal", b= "Kunal";
    String s1= new String("Somnath");
    String s2= new String("Somnath");
    System.out.printf(a.equals(b)+"%n");
    System.out.println(a==b);
    System.out.println(s1.equals(s2));
    System.out.print(s1==s2);
  }
}