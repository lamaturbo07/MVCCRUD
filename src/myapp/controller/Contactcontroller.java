package myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Contactcontroller {
      @RequestMapping(value= "/isli", method=RequestMethod.GET)
      public String displayMainPage()
      {
    	  System.out.println("abc");
    	  return "main";
      }
}
