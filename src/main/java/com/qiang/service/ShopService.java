package com.qiang.service;

import com.github.pagehelper.PageInfo;
import com.qiang.pojo.Shop;

import java.util.List;

public interface ShopService {

    //展示所有的商品
    List<Shop> getAll();

    //显示所有商品（分页）
    PageInfo splitPage(Integer pageNum,Integer pageSize);

    int save(Shop info);
}
