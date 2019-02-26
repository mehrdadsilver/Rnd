package ca.rnd.service.serviceapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mehrdad Abdolghafari
 */
@RestController
public class MainController {

    @RequestMapping("getInfo")
    public String getInfo() {
        return "This is a demo for rnd";
    }

}
