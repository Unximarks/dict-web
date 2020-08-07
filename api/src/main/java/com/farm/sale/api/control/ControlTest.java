package com.farm.sale.api.control;


import com.farm.sale.api.req.ShowcaseDto;
import com.farm.sale.api.req.UserInfoAddRequestDto;
import com.farm.sale.service.api.AgenceService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
@Api(value = "测试接口")
public class ControlTest {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private AgenceService agenceService;

    @ApiOperation(value = "橱窗广告信息-查询", notes = "橱窗广告信息-查询")
    @GetMapping("/redis")
    @ApiResponses({
            @ApiResponse(code = 200, response = ShowcaseDto.class, message = "橱窗广告信息-查询")
    })
    public String test(UserInfoAddRequestDto userInfoAddRequestDto) {
        redisTemplate.opsForValue().set("marks1", "嘻嘻");
        String value = (String) redisTemplate.opsForValue().get("marks1");
        List<String> strings = agenceService.selectAgence();
        String string = "";
        for (String s : strings) {
            string = string + s;
        }
        return "test " + string + "redis:" + value + userInfoAddRequestDto.getId();
    }

}
