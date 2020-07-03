package com.farm.sale.api.control;


import com.farm.sale.service.api.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class ControlTest {
    @Autowired
    private AgenceService agenceService;

    @RequestMapping
    public String test() {
        List<String> strings = agenceService.selectAgence();
        String string = "";
        for (String s : strings) {
            string = string + s;
        }
        return "test " + string;
    }

}
