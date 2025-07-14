import java.util.Objects;
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

  public String getName(){
    return name;
  }

  public int getID(){
    return ID;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null) return false;
    if (obj.getClass() != this.getClass()) return false;
    User user = (User) obj;
    return Objects.equals(ID,user.getID());
  }

  @Override
  public int hashCode(){
    return Objects.hash(ID);
  }


}
