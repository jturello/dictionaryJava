import java.util.ArrayList;


public class Word {
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private ArrayList<Definition> definitions = new ArrayList<Definition>();

  private  String mText;

  public Word(String string) {
    mText = string;
    instances.add(this);
  }

  public String getText() {
    return mText;
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

  public static void clear() {
    instances.clear();
  }

}
