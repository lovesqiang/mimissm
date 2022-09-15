package com.qiang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qiang.mapper.ShopMapper;
import com.qiang.pojo.Shop;
import com.qiang.pojo.ShopExample;
import com.qiang.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> getAll() {

        return shopMapper.selectByExample(new ShopExample());
    }

    @Override
    public PageInfo splitPage(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        ShopExample example = new ShopExample();
        example.setOrderByClause("shop_id desc");

        List<Shop> list = shopMapper.selectByExample(example);

        PageInfo<Shop> pageInfo = new PageInfo<Shop>(list);

        return pageInfo;
    }

    @Override
    public int save(Shop info) {

        int i = shopMapper.insert(info);

        return i;
    }
}
