package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.Blogaapp;
import com.SoftAdmin.bean.BlogaappExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogaappMapper {
    int countByExample(BlogaappExample example);

    int deleteByExample(BlogaappExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Blogaapp record);

    int insertSelective(Blogaapp record);

    List<Blogaapp> selectByExample(BlogaappExample example);

    Blogaapp selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Blogaapp record, @Param("example") BlogaappExample example);

    int updateByExample(@Param("record") Blogaapp record, @Param("example") BlogaappExample example);

    int updateByPrimaryKeySelective(Blogaapp record);

    int updateByPrimaryKey(Blogaapp record);
}