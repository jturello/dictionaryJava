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
