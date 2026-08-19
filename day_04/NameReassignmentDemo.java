public class NameReassignmentDemo{
  public static void main(String[] args) {
    Person p= new Person("Somnath");
    System.out.println(p.name);
    renamePerson(p);
    System.out.print(p.name);
  }
  static void renamePerson(Person p){
    p= new Person("NewName");
    System.out.println(p.name);
  }
}
public class Person{
  String name;
  Person(String name){
    this.name= name;
  }
}