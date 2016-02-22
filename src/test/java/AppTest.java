import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

    @Test
    public void rootTest() {
        goTo("http://localhost:4567/");
        assertThat(pageSource()).contains("Dictionary");
    }

    @Test
    public void wordIsCreatedTest() {
      goTo("http://localhost:4567/");
      click("a", withText("Add a new word"));
      fill("#newWord").with("testword");
      submit(".btn");
      assertThat(pageSource()).contains("Your word has been saved");
    }

    @Test
    public void definitionIsDisplayedTest() {
      goTo("http://localhost:4567/words:id/definitions/new");
      fill("#definition").with("This is the description");
      submit(".btn");
      click("a", withText("View words"));
      assertThat(pageSource()).contains("This is the description");
      }

      @Test
      public void wordDefinitionFormIsDisplayed() {
      goTo("http://localhost:4567/tasks/new");
      }

    // @Test
    // public void taskNotAddedWhenDescriptionBlank_true() {
    //   goTo("http://localhost:4567/tasks");
    //   String tasksPageBefore = pageSource();
    //   goTo("http://localhost:4567/tasks/new");
    //   // fill("#description").with("Mow the lawn");
    //   submit(".btn");
    //   click("a", withText("View tasks"));
    //   assertThat(pageSource()).isEqualTo(tasksPageBefore);
    // }
    //
    // @Test
    // public void taskFailMessageDisplaysWhenDescriptionEnteredIsBlank_true() {
    //   goTo("http://localhost:4567/tasks");
    //   String tasksPageBefore = pageSource();
    //   goTo("http://localhost:4567/tasks/new");
    //   // fill("#description").with("Mow the lawn");
    //   submit(".btn");
    //   assertThat(pageSource()).contains("Please try again");
    // }
    //
    // @Test
    // public void multipleTasksAreDisplayedTest() {
    //   goTo("http://localhost:4567/tasks/new");
    //   fill("#description").with("Mow the lawn");
    //   submit(".btn");
    //   goTo("http://localhost:4567/tasks/new");
    //   fill("#description").with("Buy groceries");
    //   submit(".btn");
    //   click("a", withText("View tasks"));
    //   assertThat(pageSource()).contains("Mow the lawn");
    //   assertThat(pageSource()).contains("Buy groceries");
    // }
    //
    // @Test
    // public void taskShowPageDisplaysDescriptionTest() {
    //   goTo("http://localhost:4567/tasks/new");
    //   fill("#description").with("Do the dishes");
    //   submit(".btn");
    //   click("a", withText("View tasks"));
    //   click("a", withText("Do the dishes"));
    //   assertThat(pageSource()).contains("Do the dishes");
    // }
    //
    // @Test
    // public void taskNotFoundMessageShown() {
    //   goTo("http://localhost:4567/tasks/999");
    //   assertThat(pageSource()).contains("Task not found");
    // }

  } //end of Fluent
