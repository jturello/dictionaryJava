import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("This is a definition");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void Definition_instantiatesWithText_true() {
    Definition myDefinition = new Definition("This is a definition");
    assertEquals("This is a definition", myDefinition.getText());
  }



  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("First definition");
    Definition secondDefinition = new Definition("Second definition");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void getId_DefinitionsInstantiatedWithAnID_true() {
    Definition myDefinition = new Definition("This is a definition");
    assertEquals(Definition.all().size(), myDefinition.getId());
  }
  //
  // @Test
  // public void find_returnsDefinitionWithSameId_secondDefinition() {
  //   Definition firstDefinition = new Definition("Mow the lawn");
  //   Definition secondDefinition = new Definition("Buy groceries");
  //   assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  // }
  //
  // @Test
  // public void find_returnsNullWhenNoDefinitionFound_true() {
  //   assertTrue(Definition.find(999) == null);
  // }
  //
  // @Test
  // public void clear_emptiesAllDefinitionsFromArrayList() {
  //   Definition myDefinition = new Definition("Mow the lawn");
  //   Definition.clear();
  //   assertEquals(Definition.all().size(), 0);
  // }

}
