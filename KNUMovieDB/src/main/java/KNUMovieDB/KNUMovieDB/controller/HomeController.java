package KNUMovieDB.KNUMovieDB.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(){
      log.info("Home Page");
      return "index";
    }

    @GetMapping("/index")
    public String index(){
        log.info("Home Page");
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        log.info("About Page");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        log.info("Contact Page");
        return "contact";
    }

    @GetMapping("/joinus")
    public String joinus(){
        log.info("Joinun Page");
        return "joinus";
    }

    @GetMapping("/review")
    public String review(){
        log.info("Review Page");
        return "review";
    }

    @GetMapping("/single")
    public String single(){
        log.info("Single Page");
        return "single";
    }
}
