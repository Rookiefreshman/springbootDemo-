package cn.sx.Main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/hello")
public class controller1 {
    @GetMapping(value = "/")
    public String gethello(){
        return "hello";
    }
}
