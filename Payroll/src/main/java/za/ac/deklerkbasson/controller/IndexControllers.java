package za.ac.deklerkbasson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllers {
    @GetMapping("/")
    @ResponseBody
    public String getHome() {
        return " Hello World ";
    }

}
