package io.pivotal.pal.tracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by accenturelabs on 8/18/17.
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String hello()
    {
        return "hello";
    }

}
