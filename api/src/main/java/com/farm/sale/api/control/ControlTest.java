package com.farm.sale.api.control;


import bean.Good;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class ControlTest {
    @RequestMapping
    public String test(){
        Good good = new Good();
        good.setId("1");
        return "test "+good.getId();
    }

}
