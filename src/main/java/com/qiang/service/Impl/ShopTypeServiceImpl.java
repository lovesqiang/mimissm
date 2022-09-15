package com.qiang.service.Impl;

import com.qiang.mapper.ShopTypeMapper;
import com.qiang.pojo.ShopType;
import com.qiang.pojo.ShopTypeExample;
import com.qiang.service.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ShopTypeServiceImpl")
public class ShopTypeServiceImpl implements ShopTypeService {

    @Autowired
    private ShopTypeMapper shopTypeMapper;

    @Override
    public List<ShopType> getAll() {

        List<ShopType> typeList = shopTypeMapper.selectByExample(new ShopTypeExample());

        return typeList;
    }
}
