package com.SoftAdmin.mapper;

import com.SoftAdmin.bean.BlogPcgametalk;
import com.SoftAdmin.bean.BlogPcgametalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPcgametalkMapper {
    int countByExample(BlogPcgametalkExample example);

    int deleteByExample(BlogPcgametalkExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BlogPcgametalk record);

    int insertSelective(BlogPcgametalk record);

    List<BlogPcgametalk> selectByExample(BlogPcgametalkExample example);

    BlogPcgametalk selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BlogPcgametalk record, @Param("example") BlogPcgametalkExample example);

    int updateByExample(@Param("record") BlogPcgametalk record, @Param("example") BlogPcgametalkExample example);

    int updateByPrimaryKeySelective(BlogPcgametalk record);

    int updateByPrimaryKey(BlogPcgametalk record);
}