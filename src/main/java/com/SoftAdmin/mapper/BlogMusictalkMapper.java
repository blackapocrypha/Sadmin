package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogMusictalk;
import com.SoftAdmin.bean.BlogMusictalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMusictalkMapper {
    int countByExample(BlogMusictalkExample example);

    int deleteByExample(BlogMusictalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogMusictalk record);

    int insertSelective(BlogMusictalk record);

    List<BlogMusictalk> selectByExample(BlogMusictalkExample example);

    BlogMusictalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogMusictalk record, @Param("example") BlogMusictalkExample example);

    int updateByExample(@Param("record") BlogMusictalk record, @Param("example") BlogMusictalkExample example);

    int updateByPrimaryKeySelective(BlogMusictalk record);

    int updateByPrimaryKey(BlogMusictalk record);
}