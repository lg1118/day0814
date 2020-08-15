package com.czxy.controller;

import com.czxy.domain.Goods;
import com.czxy.service.GoodsService;
import com.czxy.utlis.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2020/8/14.123213
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @PostMapping("/login")
    public BaseResult login(@RequestBody Goods goods){

        return BaseResult.ok("登录成功");
    }
}
