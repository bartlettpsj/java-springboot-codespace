package com.paul.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Paul {
    @GetMapping("/paul")
    String getPaul() {
        return "Paul was here";
    }
}
