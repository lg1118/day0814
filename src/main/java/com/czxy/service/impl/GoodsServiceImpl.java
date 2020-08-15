package com.czxy.service.impl;

import com.czxy.dao.GoodsMapper;
import com.czxy.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2020/8/14.
 */
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
}
