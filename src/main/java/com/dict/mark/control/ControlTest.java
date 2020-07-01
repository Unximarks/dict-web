package com.dict.mark.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class ControlTest {
    @RequestMapping
    public String test(){
        return "hello word 4-------";
    }

}
