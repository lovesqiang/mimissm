package com.qiang.mapper;

import com.qiang.pojo.ShopType;
import com.qiang.pojo.ShopTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopTypeMapper {
    int countByExample(ShopTypeExample example);

    int deleteByExample(ShopTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(ShopType record);

    int insertSelective(ShopType record);

    List<ShopType> selectByExample(ShopTypeExample example);

    ShopType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") ShopType record, @Param("example") ShopTypeExample example);

    int updateByExample(@Param("record") ShopType record, @Param("example") ShopTypeExample example);

    int updateByPrimaryKeySelective(ShopType record);

    int updateByPrimaryKey(ShopType record);
}