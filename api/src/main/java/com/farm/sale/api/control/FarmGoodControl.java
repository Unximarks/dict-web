package com.farm.sale.api.control;


import com.farm.sale.api.req.GoodRepDto;
import com.farm.sale.api.req.GoodUpdateReqDto;
import com.farm.sale.api.req.PageReqDto;
import com.farm.sale.api.uitl.GlobalResponse;
import com.farm.sale.model.FarmGood;
import com.farm.sale.service.api.FarmGoodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/good")
@RestController
@Api(value = "测试接口")
public class FarmGoodControl {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    private FarmGoodService farmGoodService;

    @ApiOperation(value = "商品列表-查询", notes = "商品列表-查询")
    @GetMapping("/list")
    @ApiResponses({
            @ApiResponse(code = 200, response = GoodRepDto.class, message = "商品列表-查询")
    })
    public GlobalResponse<List<FarmGood>> listGoods(PageReqDto pageReqDto) {
        List<FarmGood> list = farmGoodService.queryAllByLimit(pageReqDto.getPageNum(), pageReqDto.getPageSize());
        return GlobalResponse.success(list);
    }

    @ApiOperation(value = "商品添加", notes = "商品列表-添加")
    @PostMapping("/add")
    @ApiResponses({
            @ApiResponse(code = 200, response = String.class, message = "添加")
    })
    public GlobalResponse<String> addGoods(GoodRepDto goodRepDto) {
        FarmGood farmGood = new FarmGood();
        BeanUtils.copyProperties(goodRepDto,farmGood);
        farmGoodService.insert(farmGood);
        return GlobalResponse.success();
    }

    @ApiOperation(value = "商品修改", notes = "商品列表-修改")
    @PostMapping("/update")
    @ApiResponses({
            @ApiResponse(code = 200, response = String.class, message = "修改")
    })
    public GlobalResponse<String> updateGoods(GoodUpdateReqDto goodUpdateReqDto) {
        FarmGood farmGood = new FarmGood();
        BeanUtils.copyProperties(goodUpdateReqDto,farmGood);
        farmGoodService.update(farmGood);
        return GlobalResponse.success();
    }
}
