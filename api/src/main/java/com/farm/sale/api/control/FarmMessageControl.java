package com.farm.sale.api.control;

import com.farm.sale.api.req.MessageReqDto;
import com.farm.sale.api.uitl.GlobalResponse;
import com.farm.sale.model.FarmMessage;
import com.farm.sale.service.api.FarmMessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RequestMapping("/sendMessage")
@RestController
@Api(value = "提交信息接口")
public class FarmMessageControl {
    @Autowired
    private FarmMessageService farmMessageService;


    @ApiOperation(value = "提交信息接口", notes = "提交信息接口-修改")
    @PostMapping("/post")
    @ApiResponses({
            @ApiResponse(code = 200, response = String.class, message = "提交信息")
    })

    public GlobalResponse<String> updateGoods(MessageReqDto messageReqDto) {
        FarmMessage farmMessage = new FarmMessage();
        BeanUtils.copyProperties(messageReqDto, farmMessage);
        farmMessageService.insert(farmMessage);
        return GlobalResponse.success();
    }

    @ApiOperation(value = "查询信息接口", notes = "查询信息接口-修改")
    @GetMapping("/getList")
    @ApiResponses({
            @ApiResponse(code = 200, response = String.class, message = "查询信息")
    })
    public GlobalResponse<List<FarmMessage>> getList(MessageReqDto messageReqDto) {
        FarmMessage farmMessage = new FarmMessage();
        BeanUtils.copyProperties(messageReqDto, farmMessage);
        List<FarmMessage> farmMessages = farmMessageService.queryAllByLimit(1, 20);
        return GlobalResponse.success(farmMessages);
    }
    @ApiOperation(value = "查询信息接口", notes = "查询信息接口-修改")
    @GetMapping("/deleteById")
    @ApiResponses({
            @ApiResponse(code = 200, response = String.class, message = "查询信息")
    })
    public GlobalResponse<String> deleteById(MessageReqDto messageReqDto) {
        farmMessageService.deleteById(messageReqDto.getId());
        return GlobalResponse.success();
    }
}
