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
      assertThat(pageSource()).contains("Word List");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word"));
    fill("#word").with("testword");
    submit(".btn");
    assertThat(pageSource()).contains("testword");
  }

  @Test
  public void multipleWordsAreDisplayed_Test() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("firstWord");
    submit(".btn");
    goTo("http://localhost:4567/words/new");
    fill("#word").with("secondWord");
    submit(".btn");
    assertThat(pageSource()).contains("firstWord");
    assertThat(pageSource()).contains("secondWord");
    }

  @Test
  public void definitionIsDisplayed_Test() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("firstWord");
    submit(".btn");
    click("a", withText("firstWord"));
    click("a", withText("Add a definition"));
    fill("#definition").with("firstDefinition");
    submit(".btn");
    assertThat(pageSource()).contains("firstDefinition");
    }

  @Test
  public void multipleDefinitionsAreDisplayed_Test() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("firstWord");
    submit(".btn");
    click("a", withText("firstWord"));
    click("a", withText("Add a definition"));
    fill("#definition").with("firstDefinition");
    submit(".btn");
    click("a", withText("Add a definition"));
    fill("#definition").with("secondDefinition");
    submit(".btn");
    assertThat(pageSource()).contains("firstDefinition");
    assertThat(pageSource()).contains("secondDefinition");
    }
  }
