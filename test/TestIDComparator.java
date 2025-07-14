import org.junit.*;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.Comparator;

public class TestIDComparator{


  @Test
  public void test(){
    User [] users = new User[4];
    users[0] = new User(5,"Sergey",25);
    users[1] = new User(2,"Anton",13);
    users[2] = new User(1,"Stas",45);
    users[3] = new User(3,"Evgenii",33);
    Comparator<User> comparator = new IDComparator();

    Map<User, Integer> map = new TreeMap<>(comparator);
    for (User user : users)
      map.put(user,1);

    assertEquals(4,map.size());
    int [] correctArray = {1,2,3,5};
    int i = 0;
    for (Map.Entry<User,Integer> entry : map.entrySet()){
        assertEquals(correctArray[i++],entry.getKey().getID());
    }

  }

}
