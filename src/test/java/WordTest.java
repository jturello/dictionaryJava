import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  // @Test
  // public void Word_instantiatesCorrectly_true() {
  //   Word myWord = new Word("Mow the lawn");
  //   assertEquals(true, myWord instanceof Word);
  // }
  //
  // @Test
  // public void Word_instantiatesWithDescription_true() {
  //   Word myWord = new Word("Mow the lawn");
  //   assertEquals("Mow the lawn", myWord.getDescription());
  // }
  //
  // @Test
  // public void isComplete_isFalseAfterInstantion_false() {
  //   Word myWord = new Word("Mow the lawn");
  //   assertEquals(false, myWord.isCompleted());
  // }
  //
  // @Test
  // public void getCreateAt_instantiatesWithCurrentTime_today() {
  //   Word myWord = new Word("Mow the lawn");
  //   assertEquals(LocalDateTime.now().getDayOfWeek(), myWord.getCreateAt().getDayOfWeek());
  // }
  //
  // @Test
  // public void all_returnsAllInstancesOfWord_true() {
  //   Word firstWord = new Word("Mow the lawn");
  //   Word secondWord = new Word("Buy groceries");
  //   assertTrue(Word.all().contains(firstWord));
  //   assertTrue(Word.all().contains(secondWord));
  // }
  //
  // @Test
  // public void newId_WordsInstantiatedWithAnID_true() {
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
  // @Test
  // public void clear_emptiesAllWordsFromArrayList() {
  //   Word myWord = new Word("Mow the lawn");
  //   Word.clear();
  //   assertEquals(Word.all().size(), 0);
  // }

}
