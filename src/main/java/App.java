import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("words", request.session().attribute("words"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("words/new", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/word-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/words/:id", (request, repsonse) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Word word = Word.find(Integer.parseInt(request.params(":id")));

      model.put("word", word);
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/words", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.all());
      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    post("/words", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      ArrayList<Word> words = request.session().attribute("words");

      if (words == null) {
        words = new ArrayList<Word>();
        request.session().attribute("words", words);
      }

      String wordText = request.queryParams("newWord");
      if (wordText.length() > 0) {
        Word newWord = new Word(wordText);
        words.add(newWord);
        model.put("word", newWord);
        model.put("successFailMessage", "Your entry has been saved.");
      } else {
        model.put("successFailMessage", "No entry made. Please try again.");
      }

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


//*********************************************

get("words/:id/definitions/new", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();

  model.put("template", "templates/word-definitions-form.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());


get("/definitions/:id", (request, repsonse) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();

  Word word = Word.find(Integer.parseInt(request.params(":id")));

  model.put("word", word);
  model.put("template", "templates/word.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());


get("/definitions", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();
  model.put("definitions", Definition.all());
  model.put("template", "templates/definitions.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());


post("/definitions", (request, response) -> {
  HashMap<String, Object> model = new HashMap<String, Object>();

  model.put("definition", Definition.find(Integer.parseInt("definition"))));

  String wordText = request.params("newWord");
  if (wordText.length() > 0) {
    Word newWord = new Word(wordText);
    words.add(newWord);
    model.put("word", newWord);
    model.put("successFailMessage", "Your entry has been saved.");
  } else {
    model.put("successFailMessage", "No entry made. Please try again.");
  }

  model.put("template", "templates/success.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());


//*********************************************


  } // END OF MAIN

} // END OF App CLASS
