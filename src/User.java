public class User{
  private int ID;
  private String name;
  private int age;

  public User(int id, String name, int age){

    this.ID = id;
    this.name = name;
    this.age = age;
  }
  @Override
  public String toString(){
    return "id = " + ID + " name= " + name + " age= " + age;
  }
}
