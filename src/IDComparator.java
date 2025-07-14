import java.util.Comparator;
public class IDComparator implements Comparator<User>{

  @Override
  public int compare(User u1, User u2){
    return u1.getID()-u2.getID();
  }
}
