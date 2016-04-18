import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class PingPong {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    //
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/detector.vtl");
    //
    //   String number = request.queryParams("number");
    //   Integer integerNumber = Integer.parseInt(number);
    //   Boolean isPingPong = isPingPong(integerNumber);
    //
    //   model.put("isPingPong", isPingPong);
    //   model.put("number", request.queryParams("number"));
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }

  public static ArrayList<Object> pingPong(Integer number) {
      ArrayList<Object> myList = new ArrayList<Object>();
      return myList;
    }
  }
// }
