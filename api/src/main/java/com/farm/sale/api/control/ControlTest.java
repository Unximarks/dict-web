package com.farm.sale.api.control;


import com.farm.sale.service.api.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class ControlTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private AgenceService agenceService;

    @RequestMapping
    public String test() {
        redisTemplate.opsForValue().set("marks1","嘻嘻");
        String value = (String) redisTemplate.opsForValue().get("marks1");
        List<String> strings = agenceService.selectAgence();
        String string = "";
        for (String s : strings) {
            string = string + s;
        }
        return "test " + string + "redis:" + value;
    }

}
