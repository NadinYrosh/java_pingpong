import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String number = request.queryParams("number");
      Integer integerNumber = Integer.parseInt(number);
      ArrayList<Object> results = pingPong(integerNumber);

      model.put("finalNumbers", results);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static ArrayList<Object> pingPong(Integer number) {
    ArrayList<Object> myList = new ArrayList<Object>();
    for ( Integer i = 1 ; i <= number ; i++) {
      if (i % 15 == 0) {
      myList.add("PingPong");
    } else if (i % 5 == 0){
      myList.add("pong");
    } else if ( i % 3 == 0 ) {
      myList.add("ping");
    } else {
      myList.add(i);
    }
  }
  return myList;
  }
}


    // loop from 1 up to number, and inside the loop each time add number to myList
