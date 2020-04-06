package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogAapptalk;
import com.SoftAdmin.bean.BlogAapptalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogAapptalkMapper {
    int countByExample(BlogAapptalkExample example);

    int deleteByExample(BlogAapptalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogAapptalk record);

    int insertSelective(BlogAapptalk record);

    List<BlogAapptalk> selectByExample(BlogAapptalkExample example);

    BlogAapptalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogAapptalk record, @Param("example") BlogAapptalkExample example);

    int updateByExample(@Param("record") BlogAapptalk record, @Param("example") BlogAapptalkExample example);

    int updateByPrimaryKeySelective(BlogAapptalk record);

    int updateByPrimaryKey(BlogAapptalk record);
}