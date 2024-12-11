package by.tms.lesson5530onl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author simonpirko
 * @version 1.0
 * @since 11.12.24
 */

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    @RequestMapping
    public String greeting() {
        return "greeting";
    }
}
