import java.time.LocalDateTime;
import java.util.ArrayList;


public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();

  private String mText;
  private int mId;


  public Definition(String text) {
    mText = text;
    instances.add(this);
    mId = instances.size();
  }

  public String getText() {
    return mText;
  }


  public static ArrayList<Definition> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }
  //
  // public void completeDefinition() {
  //   mCompleted = true;
  // }
  //
  // public static Definition find(int id) {
  //   try {
  //         return instances.get(id - 1);
  //   } catch(IndexOutOfBoundsException e) {
  //     return null;
  //   }
  // }
  //
  // public static void clear() {
  //   instances.clear();
  // }

}
