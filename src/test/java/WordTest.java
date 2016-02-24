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

  // @Test
  // public void find_returnsDefinitionWithSameId_secondDefinition() {
  //   Definition firstDefinition = new Definition("Definition one");
  //   Definition secondDefinition = new Definition("Definition two");
  //   assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  // }

  // @Test
  // public void getId_WordsInstantiatedWithAnID_true() {
  //   Word myWord = new Word("Mow the lawn");
  //   assertEquals(Word.all().size(), myWord.getId());
  // }
  //
  // @Test
  // public void find_returnsWordWithSameId_secondWord() {
  //   Word firstWord = new Word("Mow the lawn");
  //   Word secondWord = new Word("Buy groceries");
  //   assertEquals(Word.find(secondWord.getId()), secondWord);
  // }
  //
  // @Test
  // public void find_returnsNullWhenNoWordFound_true() {
  //   assertTrue(Word.find(999) == null);
  // }
  //


}
