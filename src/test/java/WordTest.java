import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Word_instantiatesCorrectly_true() {
    Word myWord = new Word("Object");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void Word_instantiatesWithText_true() {
    Word myWord = new Word("Object");
    assertEquals("Object", myWord.getText());
  }

  @Test
  public void getDefinitions_instantiatesWordWithNoDefinitions_true() {
    Word myWord = new Word("Prestidigitate");
    assertEquals(0, myWord.getDefinitions().size());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Interlocutor");
    Word secondWord = new Word("baggle");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void clear_emptiesAllWordsFromArrayList() {
    Word myWord = new Word("Elemental");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test
  public void addDefinition_addsDefinitionsToWord_true() {
    Word myWord = new Word("newWord");
    myWord.addDefinition("This is newWord's first definition");
    assertEquals("This is newWord's first definition", myWord.getDefinitions().get(0).getText());
  }

  @Test
  public void word_canHaveMoreThanOneDefinition_true() {
    Word myWord = new Word("newWord");
    myWord.addDefinition("First definition");
    myWord.addDefinition("Second definition");
    assertEquals(2, myWord.getDefinitions().size());
  }

  @Test
  public void getId_wordsInstantiatedWithAnID_true() {
    Word myWord = new Word("soggy");
    assertEquals(Word.all().size(), myWord.getId());
  }

}
