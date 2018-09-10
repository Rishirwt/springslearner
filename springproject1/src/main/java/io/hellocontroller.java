package io;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class hellocontroller {

    @RestController
    public static class controller {

        @RequestMapping("/hello")
        public String histring() {
            return "hello";
        }
    }
}
