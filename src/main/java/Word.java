import java.util.ArrayList;


public class Word {
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private ArrayList<Definition> definitions = new ArrayList<Definition>();

  private  String mText;
  private int mId;

  public Word(String string) {
    mText = string;
    instances.add(this);
    mId = instances.size();
  }

  public String getText() {
    return mText;
  }

  public int getId() {
    return mId;
  }

  public boolean addDefinition(String definition) {
    Definition newDefinition = new Definition(definition);
    return definitions.add(newDefinition);
  }

  public ArrayList<Definition> getDefinitions() {
    return definitions;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public static Word find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }

}
