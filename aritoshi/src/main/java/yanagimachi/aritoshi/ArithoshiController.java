import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithoshiController {
    @GetMapping("/index")
    public String hello() {
        return "index";
    }
}